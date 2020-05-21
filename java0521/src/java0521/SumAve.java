package java0521;

import java.util.Scanner;

public class SumAve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int n = scan.nextInt();  //정수의 개수
		int sum = 0;			 //합	
		int avg = 0; 			//평균
		int i;
		for (i = 0; i < n; i++) {
			System.out.print("정수 입력 : ");
			int t = scan.nextInt();
			if(sum + t > 1000) {
				System.out.println("합계가 1000이 넘었습니다.");
				break;
			}
			sum += t;
		}
		System.out.println("합계는" + sum + "입니다");
		if(i != 0) {
			avg = sum / i;
			System.out.println("평균은" + avg + "입니다");
		}
	}

}
