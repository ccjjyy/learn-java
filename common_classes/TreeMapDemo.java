package org.cjy.common;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;


public class TreeMapDemo {

	public static void main(String[] args) {
		SortedMap<String,String> map = null;
		map = new TreeMap<String,String>();
		map.put("A-Jack", "123456");
		map.put("C-Bob", "222222");
		map.put("E-Clython", "555555");
		map.put("B-Willian", "777777");
		System.out.println("first key is: " + map.firstKey());
		System.out.println("first value is: " + map.get(map.firstKey()));
		System.out.println("last key is: " + map.lastKey());
		System.out.println("last value is: " + map.get(map.lastKey()));
		for(Map.Entry<String, String> me: map.headMap("C-Bob").entrySet()){
			System.out.println("\t|- " + me.getKey() + " --> " + me.getValue());
		}
		System.out.println();
		for(Map.Entry<String, String> me: map.tailMap("C-Bob").entrySet()){
			System.out.println("\t|- " + me.getKey() + " --> " + me.getValue());
		}
		System.out.println();
		for(Map.Entry<String, String> me: map.subMap("B-Willian","C-Bob").entrySet()){
			System.out.println("\t|- " + me.getKey() + " --> " + me.getValue());
		}
	}

}
