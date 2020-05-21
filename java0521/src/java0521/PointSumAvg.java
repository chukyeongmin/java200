package java0521;

import java.util.Scanner;

public class PointSumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//점수를 합계, 평균, 최고점, 최저점을 구하기
		
		Scanner scan = new Scanner(System.in);
		System.out.println("사람 수");
		int a = scan.nextInt(); // 사람 수
		int [] points = new int[a]; //점수
		
		System.out.println("점수를 입력하세요");
		int sum = 0;
		for (int i = 0; i < a; i++) {
			System.out.print((i+1) + "번의 점수 : ");
			points[i] = scan.nextInt();
			sum += points[i];
		}
		
		int max = points[0];
		int min = points[0];
		
		for (int i = 0; i < a; i++) {
			if(points[i] > max) max = points[i];
			if (points[i] < min) min = points[i]; 
		}
		
		System.out.println("합계는" + sum + "점 입니다.");
		System.out.println("평균은" + (double)sum / a + "점 입니다.");
		System.out.println("최고점" + max + "점 입니다.");
		System.out.println("최저점" + min + "점 입니다.");
	}

}
