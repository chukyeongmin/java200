package java0521;

import java.util.Scanner;

public class ArraySumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("��� ��");
		
		int n = scan.nextInt();
		double[] a = new double[n];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = scan.nextDouble();
		}
		
		double sum = 0;
		for (double i : a) sum += i;
		
		System.out.println("��� ����� ����" + sum + "�Դϴ�.");
		System.out.println("��� ����� ����" + sum / n + "�Դϴ�.");
	}

}
