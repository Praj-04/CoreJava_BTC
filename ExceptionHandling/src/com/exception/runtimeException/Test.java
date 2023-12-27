package com.exception.runtimeException;

public class Test {
static ArrayIndexOOB a;
	public static void main(String[] args) {
try {
	Test.a.method1();
	
} catch (NullPointerException e) {
	System.out.println("new Object is not created,hence pointing to null");
}
		
	}

}
