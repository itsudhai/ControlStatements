package org.day4;

import java.util.Scanner;

public class Q2OddEven {
	
	public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
		   
		   System.out.println("Enter the Number:");
		   
		   int a=s.nextInt();
		   
		   if(a % 2==0) {
			   System.out.println("You are Entered EVEN Number");
		   }
		   else {
			System.out.println("You are Entered ODD Number\n");
		}
		   
		   
		  }

}
