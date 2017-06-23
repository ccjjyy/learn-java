package org.cjy.learning;

class Array{
	// properties
	private int temp[];
	private int foot;
	// constructors
	public Array(int len){
		if(len > 0){
			this.temp = new int[len];
		}
		else{
			this.temp = new int[1];
		}
	}
	// functions
	public boolean add(int i){
		if(this.foot < this.temp.length){
			this.temp[foot] = i;
			this.foot++;
			return true;
		}
		else{
			return false;
		}
	}
	public int[] getArray(){
		return this.temp;
	}
}

class SortArray extends Array{
	// constructors
	public SortArray(int len){
		super(len);
	}
	//functions
	public int[] getArray(){
		java.util.Arrays.sort(super.getArray());
		return super.getArray();
	}
}

class ReverseArray extends Array{
	// constructors
	public ReverseArray(int len){
		super(len);
	}
	// functions
	public int[] getArray(){
		int[] t = new int[super.getArray().length];
		int count = t.length - 1;
		for(int i=0; i<t.length; i++){
			t[count] = super.getArray()[i];
			count--;
		}
		return t;
	}
}

public class ExtDemo {

	public static void main(String[] args) {
		ReverseArray a = new ReverseArray(5);
		System.out.print(a.add(23) + " ");
		System.out.print(a.add(21) + " ");
		System.out.print(a.add(2) + " ");
		System.out.print(a.add(42) + " ");
		System.out.print(a.add(5) + " ");
		System.out.print(a.add(6) + " ");
		print(a.getArray());
	}
	public static void print(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
}
