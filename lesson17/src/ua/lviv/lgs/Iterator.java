package ua.lviv.lgs;

public interface Iterator {
	public boolean hasNext();
	public Integer next();
}

class Collection{
	private static Integer[] arr;
	
	Collection (Integer[] arr) {
		this.arr=arr;
	}
	
	public class Fordward implements Iterator {
		private int count = 0;
		@Override
		public boolean hasNext() {
			return count<arr.length;
		}

		@Override
		public Integer next() {
			return arr[count++];
		}		
	}

	public Fordward createFordward() {
		return new Fordward();
	}
	
	
	public class Backward implements Iterator {
		private int count = arr.length-1;
		@Override
		public boolean hasNext() {
			return count>=0;
		}

		@Override
		public Integer next() {
			return arr[(count-=2)+2];
		}		
	}
	
	public Backward createBackward() {
		return new Backward();
	}
	
	
	public Iterator anonimousIterator () {
		return new Iterator() {
			private int count = arr.length-1;
			@Override
			public boolean hasNext() {				
				return count>=0;
			}

			@Override
			public Integer next() {
				return arr[count--];
			}
			
		} ;
	}
	
	
	public Iterator createIteratorLocal() {
		class Local implements Iterator {
			
			private int count = 0;
			
			@Override
			public boolean hasNext() {
				return count<arr.length;
			}

			@Override
			public Integer next() {
				return arr[count++];
			}
			
		}
		return new Local();
	}
	
	
	private static class StaticIterator implements Iterator {
		private int count = 0;
		
		@Override
		public boolean hasNext() {
			return count<arr.length;
		}

		@Override
		public Integer next() {
			return arr[count++];
		}
		
	}
	
	public static StaticIterator createStaticIterator() {
		return new StaticIterator();
	}
	
}