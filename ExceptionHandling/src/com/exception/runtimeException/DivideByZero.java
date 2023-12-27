package com.exception.runtimeException;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {

		int a, b, c;
		try {

			System.out.println("Enter two integers");
			Scanner sc = new Scanner(System.in);

			a = sc.nextInt();
			b = sc.nextInt();

			c = a / b;
			System.out.println("Result" + c);
		} catch (ArithmeticException e) {
			System.out.println("Please donot divide by zero");
		}

		System.out.println("Try again");

	}

}
