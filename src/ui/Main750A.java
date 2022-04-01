package ui;

import java.util.Scanner;

	public class Main750A {
		
		public static void main (String [] args) {
			
			Scanner sc = new Scanner (System.in);
			
			int a = sc.nextInt();
			
			int b = sc.nextInt();
			
			int res = 0;
			
			for (int i = 0; i<=a; i++) {
				
				if (i*(i+1)/2*5+b<=240) {
					
					res = i;
					
				}
				
			}
			
			System.out.println(res);
			
		}
		
		

	}


