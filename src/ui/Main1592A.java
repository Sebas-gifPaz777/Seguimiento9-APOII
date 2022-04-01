package ui;

import java.util.Arrays;
import java.util.Scanner;

public class Main1592A {
	
	public static void main (String args []) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		while (a > 0) {
			
			int b = sc.nextInt();
			
			int c = sc.nextInt();
			
			int arr[] = new int [b];
			
			for (int i = 0; i < b; i ++) {
				
				
				arr[i] = sc.nextInt();
					
				
			}
			
			Arrays.sort(arr);
			
			int d = arr[b-1]+arr[b-2];
			
			
			int e=c/d;
			
			int f=c%d;
			
			
			if (f == 0) {
				
				System.out.println(2*e);
				
			}
			
			
			else if (f <= arr [b-1]) {
				
				System.out.println(2*e+1);
				
			}
			
			else {
				System.out.println(2*e+2);
			}
			
			
			
			
		}
		
			
	}
		

}
