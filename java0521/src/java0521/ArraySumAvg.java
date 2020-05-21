package java0521;

import java.util.Scanner;

public class ArraySumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("요소 수");
		
		int n = scan.nextInt();
		double[] a = new double[n];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = scan.nextDouble();
		}
		
		double sum = 0;
		for (double i : a) sum += i;
		
		System.out.println("모든 요소의 합은" + sum + "입니다.");
		System.out.println("모든 요소의 합은" + sum / n + "입니다.");
	}

}
