package org.cjy.common;

import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	// properties
	private String name;
	private int age;
	// constructors
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		if(this.age > o.age){
			return 1;
		}
		else if(this.age < o.age){
			return -1;
		}
		else{
			return this.name.compareTo(o.name);
		}
	}
	@Override
	public String toString() {
		return "name: " + this.name + " / age: " + this.age;
	}
	
}


public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Person> allSet = new TreeSet<Person>();
		allSet.add(new Person("Bob", 40));
		allSet.add(new Person("Jack", 30));
		allSet.add(new Person("Jack", 30));
		allSet.add(new Person("Jack", 30));
		allSet.add(new Person("Clyton", 24));
		allSet.add(new Person("Alian", 22));
		allSet.add(new Person("Willian", 22));
		System.out.println(allSet);
	}

}
