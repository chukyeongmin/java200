package java0521;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n; //다시 백ㄴ
		System.out.println("몇 월 입니까?");
		int month = 1;
		if (month > 0 || month < 13) {
			month = scan.nextInt();
		}
		switch (month) {
		case 3: case 4: case 5:  
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("월은 1~12월까지만 입력하세요");
		}
	}

}
