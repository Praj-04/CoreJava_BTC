
public class ObjectAndString {

	public static void main(String[] args) {
long x = 1000;


//converting object to string( primitive--->object--->String)
Long y = Long.valueOf(x);
String s =y.toString();

//converting string to object
Long z=Long.valueOf(x);

	}

}
