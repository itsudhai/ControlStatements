package org.rolta.cont;

import java.util.Scanner;

public class SumofArrays {
	
	public static void main(String[] args) {
		
		System.out.println("Enter No of Element: ");
		Scanner s=new Scanner(System.in);
		
		int n =s.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the Nos:");
		//int a[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		System.out.println("");
		
		//float temp=a.length;
		for (int i = 0; i <a.length; i++) {
			
			a[i] = s.nextInt();
			sum=sum+a[i];
		}
		float temp=a.length;
		float avg=sum/temp;
		System.out.println("sum"+sum);
		System.out.println("avg"+avg);
		for (int i1 : a) {
			System.out.println(i1);
		}
		System.out.println(a.length);
		
		s.close();
	}

}
