package org.rolta.cont;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ExceptionTest {
	
	public static void main(String[] args) {
		//
		
		//NumberFormatException
		
		String s3="1000";
		String s4="1000 Rs";
		System.out.println(s3+500);
		
		int pp = Integer.parseInt(s3);
		
		System.out.println(pp+500+"-----s3  ");
		
		int pp1 = Integer.parseInt(s4);
		
		System.out.println(pp1+500);
		
		//InputMismatchException
		
		
		Scanner s2=new Scanner(System.in);
		
		System.out.println(s2.nextInt());
		
		//IndexOutOfBoundsException
		List<Integer> li=new LinkedList();
		
		li.add(20);
		li.add(30);
		
		System.out.println(li.get(2));
		
		//ArrayIndexOutOfBoundsException
		int a[]= {10,20,30};
		
		System.out.println(a[3]);
		
		//StringIndexOutOfBoundsException
		String s1="hai";
		
		System.out.println(s1.charAt(3));
		
		//NullPointerException
		String s=null;
		System.out.println(s.length());
		
		//ArithmeticException
		System.out.println(14/0);
		
		
	}

}
