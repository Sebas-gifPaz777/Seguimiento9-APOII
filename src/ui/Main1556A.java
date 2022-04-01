package ui;

import java.util.Scanner;

public class Main1556A {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		for (int a = sc.nextInt(); a > 0;) {
			
			int b = sc.nextInt();
			
			int c = sc.nextInt();
			
			int d = b - (b-1)/2;
			
			System.out.println(c/d);
			
		}
		
		
	}
}
