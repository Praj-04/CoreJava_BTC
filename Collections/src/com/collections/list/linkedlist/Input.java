package com.collections.list.linkedlist;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter the numbers");
				int n = sc.nextInt(); 
				int sum=0;
				for(int i=1; i<=n;i++){
					System.out.println("enter number: "+i);
				int x=sc.nextInt();
				sum+=x;
				}
				System.out.println(sum);
	}

}
