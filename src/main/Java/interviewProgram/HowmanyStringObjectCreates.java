package interviewProgram;

public class HowmanyStringObjectCreates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="hollo world";
		String a1="hollo world";
		String a2="hollo world";
		String s1 = new String("vedant");
		String s2 = new String("deepak");
		System.out.println(a==a1);
		System.out.println(a==a2);
		System.out.println(a2==a1);
		System.out.println(s2==s1);
		System.out.println(a==s1);
		
		//NaN = Not a number
		System.out.println(2.0/0.0);
		System.out.println(0.0/0.0);
		System.out.println(Math.sqrt(-1));
		System.out.println(Float.NaN == Float.NaN);
		System.out.println(Float.NaN != Float.NaN);
		double nan=2.1% 0;
		System.out.println((2.1 % 0 )==nan);
		
		
	}

}
