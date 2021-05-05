package org.day4;

import java.util.Scanner;

public class Q7Fibonacci {
	
	public static void main(String[] args) {
		
		int pNo=0,nNo=1;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for (int i = 1; i <= n; ++i) {
			System.out.println(pNo+" ");

			int sum=pNo+nNo;
			pNo=nNo+sum;
			nNo=sum;
			
					}
		
		
	}

}
