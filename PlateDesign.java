package org.cjy.learning;

abstract class Person{
	// properties
	private String name;
	private int age;
	// constructors
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	// functions
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public void say(){
		System.out.println(this.getContent());
	}
	// abstract functions
	public abstract String getContent();
}

class Student extends Person{
	// properties
	private float score;
	// constructors
	public Student(String name, int age, float score){
		super(name, age);
		this.score = score;
	}
	// functions
	public float getScore(){
		return this.score;
	}
	// override
	public String getContent(){
		return "name: " + super.getName() +
				" age: " + super.getAge() +
				" score: " + this.getScore();
	}
}

class Worker extends Person{
	// properties
	private float salary;
	// constructors
	public Worker(String name, int age, float salary){
		super(name, age);
		this.salary = salary;
	}
	// functions
	public float getSalary(){
		return this.salary;
	}
	// override
	public String getContent(){
		return "name: " + super.getName() +
				" age: " + super.getAge() +
				" salary: " + this.getSalary();
	}
}




public class PlateDesign {

	public static void main(String[] args) {
		Person per1 = new Student("Jack", 20, 99.0f);
		Person per2 = new Worker("Bob", 30, 3000.0f);
		per1.say();
		per2.say();
	}

}
