package org.cjy.common;

import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashMap;

class Person3{
	// properties
	private String name;
	private int age;
	// constructors
	public Person3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		if(!(obj instanceof Person3)){
			return false;
		}
		Person3 p = (Person3)obj;
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
		return "name: " + this.name + " age: " + this.age;
	}
	
}


public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,String> map = null;
		map = new HashMap<String,String>();
		map.put("Jack", "111111");
		map.put("Clyton", "555555");
		map.put("Willian", "333333");
		String val = map.get("Jack");
		System.out.println("key Jack's value is: " + val);
		
		System.out.println(map.containsKey("Willian"));
		System.out.println(map.containsValue("111111"));
		
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()){
			String str = iter.next();
			System.out.print(str + "/");
		}
		System.out.println();
		
		Collection<String> values = map.values();
		Iterator<String> iter2 = values.iterator();
		while(iter2.hasNext()){
			String str = iter2.next();
			System.out.print(str + "/");
		}
		System.out.println();
		
		Set<Map.Entry<String, String>> allSet = null;
		allSet = map.entrySet();
		Iterator<Map.Entry<String, String>> iter3 = null;
		iter3 = allSet.iterator();
		while(iter3.hasNext()){
			Map.Entry<String, String> me = iter3.next();
			System.out.println(me.getKey() + "-->" + me.getValue());
		}
		System.out.println();
		
		for(Map.Entry<String, String> me2: map.entrySet()){
			System.out.println(me2.getKey() + "-->" + me2.getValue());
		}
		
		
		Map<Person3, String> m = new HashMap<Person3, String>();
		m.put(new Person3("Jack", 30), "123456");
		System.out.println(m.get(new Person3("Jack", 30)));
	}

}
