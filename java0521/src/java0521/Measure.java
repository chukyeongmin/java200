package java0521;

import java.util.Scanner;

public class Measure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���.");
		int n = scan.nextInt(); //����
		int count = 0; //����
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " "); //i�� ���
				count++;
			}
			
		}
		System.out.println( "\n" + n + "�� ����� " + count + "�� �Դϴ�.");
	}

}
