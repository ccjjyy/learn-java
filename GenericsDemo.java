package org.cjy.learning;

interface Info{
	
}

class Contact implements Info{
	// properties
	private String address;
	private String telephone;
	private String zipcode;
	// constructors
	public Contact(String address, String telephone, String zipcode) {
		super();
		this.address = address;
		this.telephone = telephone;
		this.zipcode = zipcode;
	}
	// functions
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getZipcode() {
		return this.zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Contact: " + "\n" + 
				"\t |- telephone: " + this.telephone + "\n" + 
				"\t |- address: " + this.address + "\n" + 
				"\t |- zipcode: " + this.zipcode + "\n";
	}
}

class Introduction implements Info{
	// properties
	private String name;
	private String sex;
	private int age;
	// constructors
	public Introduction(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	// functions
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Introduction: " + "\n" + 
				"\t |- name: " + this.name + "\n" + 
				"\t |- sex: " + this.sex + "\n" + 
				"\t |- age: " + this.age + "\n";
	}
}


class Person2<T extends Info>{
	// properties
	private T info;
	// constructors
	public Person2(T info){
		this.setInfo(info);
	}
	// functions
	public void setInfo(T info){
		this.info = info;
	}
	public T getInfo(){
		return this.info;
	}
	// override
	public String toString(){
		return this.info.toString();
	}
}



public class GenericsDemo {

	public static void main(String[] args) {
		Contact c1 = new Contact("Beijing", "01055553333", "100088");
		Person2<Contact> per1 = null;
		per1 = new Person2<Contact>(c1);
		System.out.println(per1);
		
		Introduction i2 = new Introduction("Jack", "male", 25);
		Person2<Introduction> per2 = null;
		per2 = new Person2<Introduction>(i2);
		System.out.println(per2);
	}
	
}
