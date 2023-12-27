
public class ExplicitTupeCasting {

	public static void main(String[] args) {
		int i = 100;
		byte b = (byte) i;
		System.out.println(b);

		int x = 97;
		char ch = (char) x;
		System.out.println(ch);

		byte a = 10;
		byte c = 20;

		byte result = (byte) (a + c);
		System.out.println(result);

		int results = a + c;
		System.out.println(results);

	}

}
