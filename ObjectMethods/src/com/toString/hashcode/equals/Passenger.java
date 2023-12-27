package com.toString.hashcode.equals;
public class Passenger {

	private String firstName;
	private String lastName;
	private int id;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Passenger info "+firstName+" " +lastName;
	}
	
	@Override
	public int hashCode() {
		
		return id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Passenger passenger = (Passenger)obj;
		if(passenger.getId()==this.id && passenger.firstName == this.firstName && passenger.lastName == this.lastName) {
			return true;
		}
		return false;
	}
}
