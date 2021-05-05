package org.rolta.cont;

public class Constructor {
	
	public Constructor() {
	    this("JAVA");
	    System.out.println("Default const...");
	  }

	  public Constructor(int id) {
	    this(3456.5678f);
	    System.out.println(id);
	  }

	  public Constructor(String name) {
	    this(12);
	    System.out.println(name);
	  }

	  public Constructor(float sal) {
	    System.out.println(sal);
	  }

	  public static void main(String[] args) {
	     new Constructor();
	  }


	

}
