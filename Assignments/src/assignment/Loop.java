package assignment;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();

		for (int i = 0; i <= number; i++) {
			if (i > 100) {
				break;
			} else if (i % 10 == 0) {
				continue;
			} else {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		int j = 0;
		while (j <= number) {
			if (j > 100) {
				break;
			} else if (j % 10 == 0) {
				j++;
				continue;
			} else {
				System.out.print(j + " ");
				j++;
			}
		}
		System.out.println();

		int k = 0;
		do {
			if (k > 100) {
				break;
			} else if (k % 10 == 0) {
				k++;
				continue;
			} else {
				System.out.print(k + " ");
				k++;
			}
		} while (k <= number);
		System.out.println();
	}

}
