import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id,name,lastname,score");
		int id = sc.nextInt();
		String name = sc.next();
		String lastname = sc.next();
		double score = sc.nextDouble();
		
		System.out.println("Student details");
		System.out.println("ID :" +id);
		System.out.println(" Name " +name);
		System.out.println(" last Name " +lastname);
		System.out.println("Score " +score);
		
		
	}

}
