package java0521;

import java.util.Scanner;

public class LinerSearchTop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int n = scan.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scan.nextInt();
		}
		
		System.out.print("ã�� ���� : ");
		int key = scan.nextInt();
		
		int j;
		for (j = 0; j < n; j++) 
			if(a[j] == key) break;
		
		if(j < n)
			System.out.println("�� ���� a[" + j + "] �� �ֽ��ϴ�");
		else
			System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
		
	}

}
