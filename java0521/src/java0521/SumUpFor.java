package java0521;

import java.util.Scanner;

public class SumUpFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 n까지의 합");
		int n; 
		int sum = 0;
		System.out.println("숫자를 입력하세요");
		n = scan.nextInt();
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("합 : " + sum);
	}

}
