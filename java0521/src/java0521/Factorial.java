package java0521;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("���� �������� �Է��ϼ���");
		 n = scan.nextInt();
		 int fac = 1;
		 for (int i = 1; i < n+1; i++) {
			fac = fac*i;
		}  
		 System.out.println("����  : "+ fac);
	}

}
