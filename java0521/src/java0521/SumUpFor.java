package java0521;

import java.util.Scanner;

public class SumUpFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("1���� n������ ��");
		int n; 
		int sum = 0;
		System.out.println("���ڸ� �Է��ϼ���");
		n = scan.nextInt();
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("�� : " + sum);
	}

}
