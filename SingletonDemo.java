package org.cjy.learning;

class Singleton{
	// singleton design
	private static Singleton instance = new Singleton();
	public static Singleton getInstance(){
		return instance;
	}
	private Singleton(){
		
	}
	// functions
	public void print(){
		System.out.println("hello world");
	}
}

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton s1 = null;
		Singleton s2 = null;
		s1 = Singleton.getInstance();
		s2 = Singleton.getInstance();
		s1.print();
		s2.print();
	}

}
