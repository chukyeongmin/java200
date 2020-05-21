package java0521;

import java.util.Scanner;

public class LinerSearchTop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int n = scan.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scan.nextInt();
		}
		
		System.out.print("찾을 숫자 : ");
		int key = scan.nextInt();
		
		int j;
		for (j = 0; j < n; j++) 
			if(a[j] == key) break;
		
		if(j < n)
			System.out.println("그 값은 a[" + j + "] 에 있습니다");
		else
			System.out.println("해당 값이 존재하지 않습니다.");
		
	}

}
