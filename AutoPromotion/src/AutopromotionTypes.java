
public class AutopromotionTypes {

	public void add(int a)
	{
		System.out.println(a);
	}
	
	
	public void add(Object o) {
		System.out.println("object");
	}
	
	
//	public void add(String s)
//	{
//		System.out.println("string");
//	}
	
	
	public static void main(String[] args) {

		AutopromotionTypes p = new AutopromotionTypes();
		p.add("hey");
	}

}
