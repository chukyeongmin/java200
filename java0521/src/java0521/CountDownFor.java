package java0521;

import java.util.Scanner;

public class CountDownFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("카운트다운합니다");
		int x;
		System.out.println("양의 정수값을 입력하세요");
		x = scan.nextInt();
		for (int i = x; i >= 0; i--) {
			System.out.println(i);
		}
	}

}
