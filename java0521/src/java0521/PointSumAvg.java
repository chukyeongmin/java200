package java0521;

import java.util.Scanner;

public class PointSumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �հ�, ���, �ְ���, �������� ���ϱ�
		
		Scanner scan = new Scanner(System.in);
		System.out.println("��� ��");
		int a = scan.nextInt(); // ��� ��
		int [] points = new int[a]; //����
		
		System.out.println("������ �Է��ϼ���");
		int sum = 0;
		for (int i = 0; i < a; i++) {
			System.out.print((i+1) + "���� ���� : ");
			points[i] = scan.nextInt();
			sum += points[i];
		}
		
		int max = points[0];
		int min = points[0];
		
		for (int i = 0; i < a; i++) {
			if(points[i] > max) max = points[i];
			if (points[i] < min) min = points[i]; 
		}
		
		System.out.println("�հ��" + sum + "�� �Դϴ�.");
		System.out.println("�����" + (double)sum / a + "�� �Դϴ�.");
		System.out.println("�ְ���" + max + "�� �Դϴ�.");
		System.out.println("������" + min + "�� �Դϴ�.");
	}

}
