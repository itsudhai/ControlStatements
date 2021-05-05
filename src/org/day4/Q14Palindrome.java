package org.day4;

import java.util.Scanner;

public class Q14Palindrome {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		
		int num = s.nextInt();
		
		int reverse=0,temp;
		
		temp=num;
		
		while (num!=0) {
			int remainder=num%10;
			reverse=reverse*10+remainder;
			
			num=num/10;
					}
		
		System.out.println(reverse);
		if (reverse==temp) {
			System.out.println("Given number is palindrome  ");
		}
		else {
			System.out.println("Given number is not palindrome  ");

		}
		s.close();
	}

}
