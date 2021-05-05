package org.rolta.cont;

public class A extends B{
	  public A() {
		  
	    System.out.println("Default const...");
	  }
	 
	  public static void main(String[] args) {
	    A a = new A();
	    
	    
	    String s= "Hello world";
	    
	    String m1 = s.substring(4);
	    System.out.println(m1);
	    
	    String m2 = s.substring(1, 7);
	    System.out.println(m2);
	    
	    int l = s.length();
	    System.out.println(l);
	    
	    String u = s.toUpperCase();
	    System.out.println(u);
	    
	    String lo = u.toLowerCase();
	    System.out.println(lo);
	    
	    boolean st = s.startsWith("H");
	    System.out.println(st);
	    
	    String rep = s.replace('o', '0');
	    System.out.println(rep);
	    s.replaceAll('', replacement)
	    
	  }

	}
