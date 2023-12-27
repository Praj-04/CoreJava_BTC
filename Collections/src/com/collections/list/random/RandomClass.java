package com.collections.list.random;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
Random obj = new Random();
int i = obj.nextInt();

System.out.println(i);

int j = obj.nextInt(100);

System.out.println(j);
	}

}
