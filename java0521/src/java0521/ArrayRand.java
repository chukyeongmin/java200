package java0521;

import java.util.Random;
import java.util.Scanner;

public class ArrayRand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("¿ä¼Ò ¼ö : ");
		int n = scan.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) 
			a[i] = 1 + rand.nextInt(200);
		
		for (int i = 0; i < n; i++) 
			System.out.println("a[" + i + "] = " + a[i]);
		
	}

}
