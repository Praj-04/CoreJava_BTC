
public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello World");
	}
	
//	executed once by the JVM even before main method is called
	static {
		System.out.println("Static Block 1");
	}

	static {
		System.out.println("Static Block 2");
	}

	static {
		System.out.println("Static Block 3");
	}

}
