package org.rolta.cont;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ExceptionTest1 {
	
	public static void main(String[] args) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			try{
			System.out.println(4/0);
			}
			catch(Exception e){
				System.out.println("Time being Skip the Exception");
			}
			System.out.println(5);
			System.out.println(6);
		
	}

}
