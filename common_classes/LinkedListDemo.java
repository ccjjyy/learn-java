package org.cjy.common;

import java.util.LinkedList;


public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<String>();
		link.add("AAA");
		link.add("BBB");
		link.add("CCC");
		System.out.println("Initialization: " + link);
		link.addFirst("XXX");
		link.addLast("YYY");
		System.out.println("Add first and add last: " + link);
		
		System.out.println("Find the head through element(): " + link.element());
		System.out.println("Now the linked list is: " + link);
		
		System.out.println("Find the head through peek(): " + link.peek());
		System.out.println("Now the linked list is: " + link);
		
		System.out.println("Find the head through poll(): " + link.poll());
		System.out.println("Now the linked list is: " + link);
		
		System.out.println("Output the data by FIFO: ");
		int size = link.size();
		for(int i=0; i<size; i++){
			System.out.print(link.poll() + "/");
		}
	}

}
