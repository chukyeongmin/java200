package java0521;

import java.util.Scanner;

public class SumAve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int n = scan.nextInt();  //������ ����
		int sum = 0;			 //��	
		int avg = 0; 			//���
		int i;
		for (i = 0; i < n; i++) {
			System.out.print("���� �Է� : ");
			int t = scan.nextInt();
			if(sum + t > 1000) {
				System.out.println("�հ谡 1000�� �Ѿ����ϴ�.");
				break;
			}
			sum += t;
		}
		System.out.println("�հ��" + sum + "�Դϴ�");
		if(i != 0) {
			avg = sum / i;
			System.out.println("�����" + avg + "�Դϴ�");
		}
	}

}
