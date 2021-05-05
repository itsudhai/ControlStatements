package org.day4;

//Child
public class Test extends Data {

	public Test() {
		
		System.out.println("child Default Constructor=====");
	}

	public Test(int id) {

		System.out.println("child Para id Constructor:" + id);
	}

	public static void main(String[] args) {
		new Test();

	}
}
