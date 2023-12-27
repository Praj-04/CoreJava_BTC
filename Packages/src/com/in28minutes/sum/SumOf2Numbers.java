package com.in28minutes.sum;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Math.*; 

public class SumOf2Numbers {

	public static void main(String[] args) {

		out.println("Enter 2 numbers");
		Scanner sc = new Scanner(System.in);

		int num1 = parseInt(sc.next());
		int num2 = parseInt(sc.next());
		int result = num1 + num2;
		out.println("Sum is "+result);
		double squareroot = sqrt(result);
		System.out.println(squareroot);
		double power= pow(num2, result);
		System.out.println(power);
	}

}
