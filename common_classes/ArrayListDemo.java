package org.cjy.common;

import java.util.List;
import java.util.Collection;

import java.util.ArrayList;


public class ArrayListDemo {

	public static void main(String[] args) {
		// add
		List<String> allList = null;
		allList = new ArrayList<String>();
		allList.add("hello");
		allList.add(0, "world");
		System.out.println(allList);
		
		Collection<String> allCollection = null;
		allCollection = new ArrayList<String>();
		allCollection.add("cjy");
		allCollection.add("ccjjyy");
		System.out.println(allCollection);
		
		allList.addAll(allCollection);
		System.out.println(allList);
		
		allList.addAll(0, allCollection);
		System.out.println(allList);
		
		// remove
		System.out.println();
		System.out.println(allList);
		allList.remove(0);
		System.out.println(allList);
		allList.remove("hello");
		System.out.println(allList);
		
		// print
		System.out.println();
		System.out.println(allList);
		for(int i=0; i<allList.size(); i++){
			System.out.print(allList.get(i) + " / ");
		}
		
		// toArray
		System.out.println();
		System.out.println();
		System.out.println(allList);
		String[] a = new String[] {};
		String[] str = allList.toArray(a);
		for(int i=0; i<str.length; i++){
			System.out.print(str[i] + " / ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println(allList);
		Object[] obj = allList.toArray();
		for(int i=0; i<obj.length; i++){
			String temp = (String)obj[i];
			System.out.print(temp + " / ");
		}
	}
	
}
