package org.rolta.cont;

import java.util.Scanner;

public class MultiArray {
	
	public static void main(String[] args) {
		
		int a[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		
		System.out.println(a[1][3]);
		
		System.out.println("normal loop    ");
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {
				
				
					
					System.out.print(a[i][j]+"\t");
				}
				System.out.println(" ");
			}
			System.out.println("");
		}
		
	}


