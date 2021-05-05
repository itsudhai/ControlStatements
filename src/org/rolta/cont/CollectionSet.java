package org.rolta.cont;

import java.util.*;

public class CollectionSet {
public static void main(String[] args) {
	
	Set <Integer> se=new HashSet<>();
	
	se.add(10);
	se.add(20);
	se.add(30);
	se.add(90);
	se.add(70);
	
	System.out.println(se);
	int sz = se.size();
	System.out.println(sz);
	
	
	List<Integer> li= new ArrayList<>();
	
	li.add(70);
	li.add(20);
	li.add(60);
	li.add(10);
	li.add(30);
	li.add(10);
	
	System.out.println(li);
	
	Set<Integer> s1=new TreeSet<>();
	
	s1.addAll(li);
	
	System.out.println(s1);
	
	boolean eq = s1.equals(se);
	System.out.println(eq);
	
	System.out.println(li.size()-s1.size());
	
	Set<Character> ch=new TreeSet<>();
	
	ch.add('A');
	ch.add('@');
	ch.add('~');
	ch.add('c');
	ch.add('7');
	ch.add(' ');
	System.out.println(ch);
	
	boolean chk = ch.contains('A');
	System.out.println(chk);
	
	boolean chk1 = ch.isEmpty();
	System.out.println(chk1);
	
	List<Integer> l3=new  ArrayList<>();
	
	l3.addAll(li);
	System.out.println("*****LIST*****");
	System.out.println(l3);
	
	l3.add(2, 85);
	l3.add(6, 25);
	
	System.out.println(l3);
	
	l3.remove(1);
	System.out.println(l3);
	
	l3.retainAll(li);
	
	System.out.println(l3);
	
	Integer l4 = l3.get(4);
	System.out.println(l4);
	
	for (int i = 0; i < li.size(); i++) {
		
		System.out.println(li.get(i));
		
		
	}
	
	System.out.println("Enhanced Loop");
	
for (Integer x : li) {
	System.out.println(x);
	
}
	
Set<Integer> ss= new TreeSet<>();

ss.addAll(li);

System.out.println(ss);

for (Integer ss1 : ss) {
	System.out.println(ss1);
	
	
}

	li.forEach(System.out::println);
	
	
}
}
