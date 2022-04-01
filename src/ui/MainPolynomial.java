package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainPolynomial {
	
	public static InputStreamReader isr= new InputStreamReader(System.in);
	public static BufferedReader br= new BufferedReader(isr);
	
	public static void main(String[]args) {
		
		try {
			solve();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static void solve() throws IOException {	
		
		int n=Integer.parseInt(br.readLine());
		long[] answers= new long[n];
		int count=0;
		while(count<n) {
			long a=(long) 0;
			long b=(long) 0;
			long c=(long) 0;
			long k=(long)0;
			long re=(long)0;
			long ans=(long) 0;
			
			String num=br.readLine();
			String[] numbers=num.split("\\ ");
			a=Long.parseLong(numbers[0]);
			b=Long.parseLong(numbers[1]);
			c=Long.parseLong(numbers[2]);
			k=Long.parseLong(numbers[3]);
			
			long start=(long) 0;
			long finish=(long) 1000000;
			long medio=(long) -1;
			boolean ok=false;
			while(start<finish && !ok) {
				medio=(start+finish)/2;
				
				re=(long)((medio*medio)*a)+(medio*b)+c;
				
				if(c>=k)
					ok=true;
				else if(re==k) {
					ans=medio;
					ok=true;
				}
				else if(re<k)
					start=medio+1;
				
				else if(re>k) {
					finish=medio;
					ans=medio;
				}
					
			}
			answers[count]=ans;
			count++;
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(answers[i]);
		}
		
		isr.close();
		br.close();
	}
}
