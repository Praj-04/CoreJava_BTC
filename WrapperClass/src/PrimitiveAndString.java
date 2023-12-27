
public class PrimitiveAndString {

	public static void main(String[] args) {

		byte x= 100;
		
//		convert primitive to String
		String s= Byte.toString(x);
		
		
//		convert  String  to primitive
		byte y =Byte.parseByte(s);
		
	}

}
