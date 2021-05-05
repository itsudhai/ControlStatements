package org.day4;

//Parent
public class Data {
	public Data() {
		this(67);
		System.out.println("Parent Default con");
	}
	
	public Data(int id) {
		System.out.println("Parent Para id con:"+id);
	}

}
