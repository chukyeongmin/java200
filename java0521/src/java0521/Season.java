package java0521;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n; //�ٽ� �餤
		System.out.println("�� �� �Դϱ�?");
		int month = 1;
		if (month > 0 || month < 13) {
			month = scan.nextInt();
		}
		switch (month) {
		case 3: case 4: case 5:  
			System.out.println("��");
			break;
		case 6: case 7: case 8:
			System.out.println("����");
			break;
		case 9: case 10: case 11:
			System.out.println("����");
			break;
		case 12: case 1: case 2:
			System.out.println("�ܿ�");
			break;
		default:
			System.out.println("���� 1~12�������� �Է��ϼ���");
		}
	}

}
