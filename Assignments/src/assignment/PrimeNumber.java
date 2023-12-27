package assignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = sc.nextInt();
		boolean primeFlag = true;

		for (int i = 2; i <= number - 1; i++) {
			if (number % 2 == 0) {
				primeFlag = false;
			}
		}

		if (primeFlag) {
			System.out.println("The number is prime number");
		} else {
			System.out.println("The number is not prime number");
		}

	}

}
