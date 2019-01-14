package ua.lviv.lgs;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Integer[] array = { 208, 7, 18, -8, 276, -318, 60, 28, 65, -85, 145, 97, -15, 250, 450 };
		Collection collection = new Collection(array);
		
		
		// ������� �����
		System.out.println();
		System.out.println("������� �����");
		System.out.println(Arrays.toString(array));
		System.out.println();

		Iterator iteratorFordward = collection.createFordward();
		while (iteratorFordward.hasNext()) {
			Integer next = iteratorFordward.next();
			System.out.println((next%2==0) ? next:0);
		}
		System.out.println();

		Iterator iteratorBackward = collection.createBackward();
		while (iteratorBackward.hasNext()) {
			System.out.println(iteratorBackward.next());
		}

		// �������� ����	
		System.out.println();
		System.out.println("�������� ����");
		System.out.println(Arrays.toString(array));
		
		Iterator anonimous = collection.anonimousIterator();
		int i = 0;
		while (anonimous.hasNext()) {
			Integer next = anonimous.next();
			if (i == 3) i = 0;
			if (i == 0) {
				if (next % 2 == 1) {
					System.out.println("�������� ����� ����� �������  = " + next);
				}
			}
			i++;
		}
		
		
		// ��������� ����
		System.out.println();
		System.out.println("��������� ����");
		System.out.println(Arrays.toString(array));
		Iterator local = collection.createIteratorLocal();
		i=0;
		while (local.hasNext()) {
			Integer next = local.next();
			if (i==5) i=0;
			if (i==0) {
				if (next%2 == 0) {
					System.out.println("����� ����� ������ ������� ������ - 100 = "+(next-100));
				}
			}
			i++;
		}
		
		
		// ��������� ����
		System.out.println();
		System.out.println("��������� ����");
		System.out.println(Arrays.toString(array));
		Iterator staticIterator = collection.createStaticIterator();
		i=0;
		while (staticIterator.hasNext()) {
			Integer next = staticIterator.next();
			if (i==2) i=0;
			if (i==0) {
				if (next%2==0) {
					System.out.println("����� ������ ������� ������ ���� "+(next+1));
				}
			}
			i++;
		}
	}

}
