package java0521;

import java.util.Scanner;

public class CountDownFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("ī��Ʈ�ٿ��մϴ�");
		int x;
		System.out.println("���� �������� �Է��ϼ���");
		x = scan.nextInt();
		for (int i = x; i >= 0; i--) {
			System.out.println(i);
		}
	}

}
