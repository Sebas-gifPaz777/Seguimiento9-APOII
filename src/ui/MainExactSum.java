package ui;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MainExactSum {
	
	public static InputStreamReader isr= new InputStreamReader(System.in);
	public static BufferedReader br= new BufferedReader(isr);
	
	public static void main(String[]args) {
		
		try {
			solution();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
	public static void solution() throws NumberFormatException, IOException {
		boolean flag=false;
		String line=br.readLine();
		ArrayList<String> print= new ArrayList<>();
		while(!flag) {
			int n=Integer.parseInt(line);
			String nums= br.readLine();
			int cash=Integer.parseInt(br.readLine());
			br.readLine();
			String[] num=nums.split(" ");
			
			ArrayList<Integer> arr= new ArrayList<>();		
			
			for(int i=0;i<n;i++) {
				arr.add(Integer.parseInt(num[i]));
			}
			Collections.sort(arr);
			
			int fs=0;
			int dif=9999999;
			int vs=0;
			int pr1=0;
			int pr2=0;
			for(int i=0;i<arr.size();i++) {
				fs=arr.get(i);
				vs=cash-fs;
				int start=0;
				int finish=arr.size()-1;
				boolean find=false;
				while(start<=finish && !find) {
					int mid=(start+finish)/2;
					
					if(vs==arr.get(mid)) {
						if(Math.abs(fs-vs)<dif) {
							pr1=fs;
							pr2=vs;
							dif=Math.abs(fs-vs);
							find=true;
						}
						else
							find=true;
					}
					if(vs<arr.get(mid))
						finish=mid-1;
					if(vs>arr.get(mid))
						start=mid+1;
				}
			}
			//br.readLine();
			print.add("Peter should buy books whose prices are "+pr1+" and "+pr2);
			line = br.readLine();
			if(line == null || line.equals("") ) {
				flag=true;
			}
		}
		
		for(int i=0;i<print.size();i++) {
			System.out.println(print.get(i));
			System.out.println();
		}
		
		isr.close();
		br.close();
		  
	}

}

