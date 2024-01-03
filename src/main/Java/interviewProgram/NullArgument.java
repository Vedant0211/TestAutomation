package interviewProgram;

public class NullArgument {
	//pass null argument with method overloading with string and object type
	public static void test(Object o) {
		System.out.println("OBJECT Argument");
	}
	public static void test(String a) {
		System.out.println("String Argument");
	}
	/*public static void test(StringBuffer a) {
		System.out.println("String Argument");
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(null);
		test(null);
	}

}
