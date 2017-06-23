package org.cjy.learning;

public class StringDemo {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
		
		// String.toCharArray()
		String s1 = "academic";
		char[] c = s1.toCharArray();
		for(int i=0; i<c.length; i++){
			System.out.print(c[i] + " ");
		}
		
		// String(char[] value) 
		String s2 = new String(c);
		System.out.println(s2);
		
		// String(char[] value, int offset, int count)
		String s3 = new String(c, 3, 2);
		System.out.println(s3);
	}

}
