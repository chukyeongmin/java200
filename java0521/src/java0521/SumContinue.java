package java0521;

import java.util.Scanner;

public class SumContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ���մϴ�");
		System.out.println("�� ���� ���ұ��?");
		int n = scan.nextInt();
		int sum = 0;
		int count = 0;
		int i;
		for (i = 0; i< n; i++) {
			System.out.print("���� : ");
			int t = scan.nextInt();
			if(t < 0) {
				System.out.println("������ ���X");
				continue;
			}
			sum += t;
			count++;
		}
		System.out.println("�հ��" + sum + "�Դϴ�");
		if(i != 0) {
			int avg = sum / count;
			System.out.println("�����" + avg + "�Դϴ�");
		}
	}

}
