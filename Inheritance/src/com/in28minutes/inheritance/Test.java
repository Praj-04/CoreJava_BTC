package com.in28minutes.inheritance;

public class Test {

	public static void main(String[] args) {
		String[] projects = new String[] { "flight reservation", "Flight check-in" };
		Manager manager = new Manager(1, "Praj", "Travel", 100000, projects);
		System.out.println(manager.id);
		System.out.println(manager.name);
		System.out.println(manager.dept);
		System.out.println(manager.salary);
		manager.work();

	}

}
