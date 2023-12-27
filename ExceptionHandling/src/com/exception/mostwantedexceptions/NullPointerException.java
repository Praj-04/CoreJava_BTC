package com.exception.mostwantedexceptions;

public class NullPointerException {

	public static void main(String[] args) {
String s="Hello";
System.out.println(s.length());

s=null;
System.out.println(s.length());
}

}
