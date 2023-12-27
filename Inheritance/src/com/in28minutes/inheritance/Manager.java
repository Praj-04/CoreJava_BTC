package com.in28minutes.inheritance;

public class Manager extends Employee {
	
	String[] projects;

	public Manager(int id, String name, String dept, double salary, String[] projects) {
		super(id, name, dept, salary);
		System.out.println("Inside manager constructor");
		this.projects=projects;
	}

	@Override
	protected void work() {
		super.work();
		System.out.print("Manager is managing "+" ");
		for(String project:projects) {
			System.out.print(project+",");
		}
	}
}
