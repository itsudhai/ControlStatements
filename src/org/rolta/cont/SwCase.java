package org.rolta.cont;

import java.util.Scanner;

public class SwCase {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		
		int a = s.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("Sunday");
			
			break;
		
		case 2:
			System.out.println("Monday");
			
			break;
			
		case 3:
			System.out.println("Tuesday");
			
			break;
			
		case 4:
			System.out.println("Wednesday");
			
			break;
			
		case 5:
			System.out.println("Thusday");
			
			break;	
			
		case 6:
			System.out.println("Friday");
			
			break;
		default:
			System.out.println("Saturday");
			break;
		}
		s.close();
	}
	

}
