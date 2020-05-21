package java0521;

import java.util.Scanner;

public class SumContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 더합니다");
		System.out.println("몇 개를 더할까요?");
		int n = scan.nextInt();
		int sum = 0;
		int count = 0;
		int i;
		for (i = 0; i< n; i++) {
			System.out.print("정수 : ");
			int t = scan.nextInt();
			if(t < 0) {
				System.out.println("음수는 계산X");
				continue;
			}
			sum += t;
			count++;
		}
		System.out.println("합계는" + sum + "입니다");
		if(i != 0) {
			int avg = sum / count;
			System.out.println("평균은" + avg + "입니다");
		}
	}

}
