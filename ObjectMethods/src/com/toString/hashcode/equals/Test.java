package com.toString.hashcode.equals;

public class Test {

	public static void main(String[] args) {
Passenger p = new Passenger();
p.setFirstName("Prajna");
p.setLastName("Yog");
p.setId(123);

Passenger p1 = new Passenger();
p1.setFirstName("Prajna");
p1.setLastName("Yog");
p1.setId(123);

System.out.println(p);

System.out.println(p.hashCode());

System.out.println(p.equals(p1));
	}

}
