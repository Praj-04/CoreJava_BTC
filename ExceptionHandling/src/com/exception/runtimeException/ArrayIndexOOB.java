package com.exception.runtimeException;

public class ArrayIndexOOB {

	public static void main(String[] args) {
int[] a= {1,2,3	};

try {
	for(int i=0;i<=a.length;i++)
	{
		System.out.println(a[i]);
	}

} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("index beyond array length");
}
System.out.println("After try catch");



}
	
	public void method1() {
		System.out.println("Example of Null pointer exception");
	}
}
