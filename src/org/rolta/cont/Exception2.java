package org.rolta.cont;

import java.util.Scanner;

public class Exception2 {
	
	private static void empid() {

		Scanner s;
		s = new Scanner(System.in);
		System.out.println("Enter Employee ID");
		String id=s.next();
		
		if(id.startsWith("RIL")) {
			System.out.println(" Valid Employee ID : "+id);
		}
		else {
			System.out.println(" Please Enter Valid Employee ID : ");
		}
		s.close();
	}
	public static void main(String[] args) {
		
		empid();
	}
}
