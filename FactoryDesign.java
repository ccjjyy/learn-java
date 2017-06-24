package org.cjy.learning;

interface Fruit{
	public void eat();
}

class Apple implements Fruit{
	public void eat(){
		System.out.println("eat apple!");
	}
}

class Orange implements Fruit{
	public void eat(){
		System.out.println("eat orange!");
	}
}

class Factory{
	public static Fruit getInstance(String name){
		Fruit f = null;
		if("apple".equals(name)){
			f = new Apple();
		}
		if("orange".equals(name)){
			f = new Orange();
		}
		return f;
	}
}


public class FactoryDesign {

	public static void main(String[] args) {
		Fruit f = Factory.getInstance("orange");
		if(f != null){
			f.eat();
		}
	}

}
