package org.rolta.cont;

import java.util.Arrays;

public class Arr {
	
	public static void main(String[] args) {
		
		int a[]= new int[6];
		
		a[1]=10;
		a[2]=20;
		a[3]=30;
		a[4]=50;
		a[5]=10;
		a[1]=60;
		
		int b[]= {10,20,30,40,10,45,50};
		
		for (int i : a) {
			
			System.out.println(i);
		}
		
//Size of array
		
		int l1 = a.length;
		int l2=b.length;
		System.out.println("Length of a is "+l1+"  b is length  "+l2);
		
		
//		get a particular value
		
		System.out.println(a[2]);
		
// normal for loop
		
		for (int i = 0; i < b.length; i++) {
			
			System.out.println(b[i]);
		}
			
// enhanced loop
			System.out.println("enhanced for loop");
			for (int x : a) {
				
				System.out.println(x);
				
			}
		
int[] c1 = a.clone();	

int[] c2 = c1.clone();

int c3[]= {0,1,2,3,4,5};
int c4[]= {0,1,2,3,4,5};

for (int y : c1) {
	System.out.println(y);
}

System.out.println("c1[3] is "+c1[3]);

if (c3==c4)
  System.out.println("both are equal");

else 
	System.out.println("not equal ");

boolean eq1 = c1.equals(a);
System.out.println(eq1);

if(Arrays.equals(c3, c4)) {
	
	System.out.println("Arrays are Equal");
	

}
else {
	System.out.println("Arrays are Not Equal");
}
	

}
}