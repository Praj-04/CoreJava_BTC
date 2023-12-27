
public class PrimitiveAndObject {

	public static void main(String[] args) {
int x=100;

//primitive to object

Integer y= Integer.valueOf(x);
//Integer y=x;
System.out.println(y);

//object to primitive
int z= y.intValue();
System.out.println(z);
	}

}
