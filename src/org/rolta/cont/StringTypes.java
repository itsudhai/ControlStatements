package org.rolta.cont;

public class StringTypes {
	
	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("welcome");
		StringBuffer s2 = new StringBuffer("welcome");
		
		StringBuffer s3 = s1.append(s2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		StringBuilder s11=new StringBuilder("Welcome");
		
		System.out.println(s11);
		
				
		int id1 = System.identityHashCode(s1);
		int id2 = System.identityHashCode(s2);
		
		int id11 = System.identityHashCode(s3);
		
		System.out.println(id1);
		System.out.println(id2);
		System.out.println(id11);
		
		System.out.println("mut");
		String s4= "welcome";
		
		String s5="welcome";
		
		String s7 = s4.concat(s5);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s7);
		
		
		int id4 = System.identityHashCode(s5);
        int id3 = System.identityHashCode(s4);
		int id5 = System.identityHashCode(s7);
		System.out.println(id3);
		System.out.println(id4);
		
		System.out.println(id5);
		
		int l1 = s1.length();
		
		char cs4 = s4.charAt(3);
		
		System.out.println(cs4);
		
		System.out.println("s1 is  "+s1+"\n"+"length is "+l1);
	
		
		
	}

}
