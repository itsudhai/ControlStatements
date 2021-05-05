package org.rolta.cont;

public class Control {
	
	public static void main(String[] args) {
		// if and if else
		int a=1234;
		if(a==123) {
			
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		// nested if  ---- if(if)
		
		int age=20,weight=65;
		
		if(age>=18) {
			if(weight>=60) {
				System.out.println("Able to Donate the Blood");
			}
			else {
				System.out.println("Cant able to Donate Blood");
			}
		}
		 //AND &&
		
		int ag=17, wt=65;
		
		if(ag>=18 && wt>=60) {
			System.out.println("Ablt to DONATE the Blood");
		}
		
		else {
			System.out.println("Can't able to Donate the Blood");
		}
		
		// OR ||
		
		int age1=60, ht=100;
		if(age1<=5 || ht<=120) {
			System.out.println("Half Ticket");
			
		}
		else {
			System.out.println("Full Ticket");
		}
		int x=10,y=40,z=30;
		
		if(x>y&&x>z) {
			System.out.println("X is Grater");
		}
		else if (y>x&&y>z) {
			System.out.println("Y is Grater");
		}
		else {
			System.out.println("Z is Grater");
		}
		
		//LOOP
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}

	}

}
