package org.day4;

import java.util.Scanner;

public class Q11ReverseNo {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Number to be Reversed :");
		
		int a = s.nextInt();
		int reverse=0;
		
		while(a!=0)
		{
			int remainder= a%10;
			reverse=reverse*10+remainder;
			a=a/10;
			
		}
		System.out.println("Reverse of Given Number is "+reverse);
		s.close();
	}

}
