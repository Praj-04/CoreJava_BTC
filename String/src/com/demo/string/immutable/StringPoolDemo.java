package com.demo.string.immutable;

public class StringPoolDemo {

	public static void main(String[] args) {
		User u1 = new User(1, "abc");
		User u2 = new User(2, "def");
		User u3 = new User(1, "abc");
		
		System.out.println(u1);
		System.out.println(u2);

		String s1 = "abc";
		String s2 = "abc";
		String s3 ="def";
		String s4 = new String("abc");
				
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("S4 created using new "+ s4.hashCode() );
		
//		== checks the memory location
		System.out.println(s1==s2); 
		System.out.println(s1==s3);
		
		
//	equals	Checks the contents of String 
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		
		
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		
		//objects created in diff meme location
		System.out.println(u1==u2);
		System.out.println(u1==u3);
		
//		returns false even if values same..we have to check if obj have same values using equals and hashcode .we will learn that in Collections
		System.out.println(u1.equals(u2));
		System.out.println(u1.equals(u3));
		
		
		
	}

}
