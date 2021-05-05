package org.day4;

import java.util.Scanner;

public class Q8Prime {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a Number : ");
		
		int a =s.nextInt();
		Boolean b= false;
		
		for (int i = 2; i<= a/2 ; i++) {
			if(a%2==0) {
				
				b=true;
				break;
				
			
		}
		}
			if (!b) {
				System.out.println("Prime");

			}
			else {
				System.out.println("Not Prime");

			}
			
		
		
		
			
		
	}

}
