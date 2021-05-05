package org.day4;

import java.util.Scanner;

public class Q6Factorial {
	
	
	public static void main(String[] args) {
		int fact=1;
System.out.println("Enter the Number :");
		Scanner s=new Scanner(System.in);

		int num=s.nextInt();

		for (int i = num; i > 0; i--) {
			
			fact=fact*i;
		}
		
		System.out.println("Factorial of "+num+" is "+fact);
	}
	

}
