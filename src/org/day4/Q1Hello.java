package org.day4;

import java.util.Scanner;

public class Q1Hello {
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   
	 System.out.println("Enter your age:");
	   
	int age=s.nextInt();
	  
	   if(age>=18) {
		   System.out.println("You are Eligible to Vote");
	   }
	   else {
		System.out.println("You are Not Eligible to Vote\n");
	   		}
	  }
}

