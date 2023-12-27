package com.exception.runtimeException;

public class NumberFormatException {

	public static void main(String[] args) {

try {
	String s ="Hello";
	int i=Integer.parseInt(s);
	System.out.println(i);
} catch (Exception e) {
	System.out.println("Cannot convert the string ");
}

	}

}
