package ui;

import java.util.Scanner;

public class Main1611B {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		
		for (int i = 0; i < a; i++) {
			
			int b = sc.nextInt();
			
			int c = sc.nextInt();
			
			System.out.println(Math.min((a+b)/4, Math.min(a, b)));
			
			
		}	
		
	}
}