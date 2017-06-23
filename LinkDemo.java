package org.cjy.learning;

class Link{
	class Node{
		private String data;
		private Node next;
		public Node(String data){
			this.data = data;
		}
		public void add(Node newNode){
			if(this.next == null){
				this.next = newNode;
			}
			else{
				this.next.add(newNode);
			}
		}
		public void print(){
			System.out.print(this.data + " ");
			if(this.next != null){
				this.next.print();
			}
		}
		public boolean search(String data){
			if(data.equals(this.data)){
				return true;
			}
			else{
				if(this.next != null){
					return this.next.search(data);
				}
				else{
					return false;
				}
			}
		}
		public void delete(Node previous, String data){
			if(data.equals(this.data)){
				previous.next = this.next;
			}
			else{
				if(this.next != null){
					this.next.delete(this, data);
				}
			}
		}
	}
	private Node root;
	
	public void addNode(String data){
		Node newNode = new Node(data);
		if(this.root == null){
			this.root = newNode;
		}
		else{
			this.root.add(newNode);
		}
	}
	
	public void printNode(){
		if(this.root != null){
			this.root.print();
		}
	}
	
	public boolean contains(String data){
		return this.root.search(data);
	}
	
	public void deleteNode(String data){
		if(this.contains(data)){
			if(this.root.equals(data)){
				this.root = this.root.next;
			}
			else{
				this.root.next.delete(root, data);
			}
		}
	}
}


public class LinkDemo {

	public static void main(String[] args) {
		Link l = new Link();
		l.addNode("AAA");
		l.addNode("BBB");
		l.addNode("CCC");
		l.addNode("DDD");
		l.addNode("EEE");
		l.printNode();
		
		System.out.println();
		System.out.println(l.contains("XXX"));
		
		l.deleteNode("CCC");
		l.deleteNode("DDD");
		l.printNode();
	}
	
} 
