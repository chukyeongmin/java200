package java0521;

import java.util.Scanner;

public class Measure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("정수값을 입력하세요.");
		int n = scan.nextInt(); //정수
		int count = 0; //개수
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " "); //i는 약수
				count++;
			}
			
		}
		System.out.println( "\n" + n + "의 약수는 " + count + "개 입니다.");
	}

}
