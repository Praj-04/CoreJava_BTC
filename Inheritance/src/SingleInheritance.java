
public class SingleInheritance { //this class implicitly extends Object class
void m1() {
	System.out.println("Every class does a single inheritance of Object class");
}

public static void main(String[] args) {
	SingleInheritance si = new SingleInheritance();
	si.m1();
	si.hashCode(); //this is from Object class
}
}
