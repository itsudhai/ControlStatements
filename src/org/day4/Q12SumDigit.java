package org.day4;

import java.util.Scanner;

public class Q12SumDigit {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = s.nextInt();
		int digit=0,sum=0;
		while (num!=0) {
			
			int j=num%10;

			num=num/10;

			//count
			digit++;
			
			//sum
			sum=sum+j;
			
			
		}
		System.out.println("You are Entered "+digit +" digit number\n"+"Sum of Entered number is "+sum);
	s.close();
	}

}
