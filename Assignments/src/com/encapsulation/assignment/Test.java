package com.encapsulation.assignment;

public class Test {

	public static void main(String[] args) {
		EncapsulationPatient e = new EncapsulationPatient();
		e.setId(1);
		e.setName("Adi");
		e.setSsn("1234");
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSsn());
	}

}
