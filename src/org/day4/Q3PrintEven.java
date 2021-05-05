package org.day4;

import java.util.Scanner;

public class Q3PrintEven {
	
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Number to find the Even Numbers between 1 to n");
	int a=s.nextInt();
	int b=0; // for to find sum of even
		for(int i=1;i<=a;i++) {
		if(i%2==0) {
		
		//To Print Even Numbers
			
			System.out.println(i+"\t");
			
// to find the sum of even we are taking 
	      
			b=b+i;
		}
		
	}
	System.out.println("Sum of Even: "+b);
		
		

}
}
