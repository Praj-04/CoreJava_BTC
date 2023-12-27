
public class StaticMethodsDemo {

	public static void main(String[] args) {
		System.out.println("inside main");
		StaticMethodsDemo.method();

	}

	static void method() {
		System.out.println("static method called");
	}

	static {
		System.out.println("Inside static block");
		StaticMethodsDemo.method();
	}
}
