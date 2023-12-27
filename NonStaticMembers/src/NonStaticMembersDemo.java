
public class NonStaticMembersDemo {

	int num;

//	constructor
	NonStaticMembersDemo() {
		System.out.println("Inside the constructor");
	}

//	Non static block
	{
		System.out.println("Inside the Non static block");

	}

	public static void main(String[] args) {
		System.out.println("Inside the main");
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();
	}

		static {
			System.out.println("Inside static block");
		}
	
}
