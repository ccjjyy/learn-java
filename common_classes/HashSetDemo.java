package org.cjy.common;

import java.util.Set;
import java.util.HashSet;

class Person1{
	// properties
	private String name;
	private int age;
	// constructors
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		if(!(obj instanceof Person1)){
			return false;
		}
		Person1 p = (Person1)obj;
		if(this.name.equals(p.name) && this.age==p.age){
			return true;
		}
		else{
			return false;
		}
	}
	@Override
	public int hashCode() {
		return this.name.hashCode() * this.age;
	}
	@Override
	public String toString() {
		return "name: " + this.name + " / age: " + this.age;
	}
	
}


public class HashSetDemo {

	public static void main(String[] args) {
		Set<Person1> allSet = new HashSet<Person1>();
		allSet.add(new Person1("Bob", 40));
		allSet.add(new Person1("Jack", 30));
		allSet.add(new Person1("Jack", 30));
		allSet.add(new Person1("Jack", 30));
		allSet.add(new Person1("Clyton", 27));
		allSet.add(new Person1("Alian", 22));
		allSet.add(new Person1("Willian", 22));
		System.out.println(allSet);
	}

}
