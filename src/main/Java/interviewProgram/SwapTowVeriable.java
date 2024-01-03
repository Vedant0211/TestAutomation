package interviewProgram;

public class SwapTowVeriable {
	
	public static void usingThreeinteger() {
		int a,b,c;
		a=10;
		b=20;
		System.out.println("before a="+a+" b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("after Swap a="+a+" b="+b);
		
	}
	public static void usingTwointeger() {
		int a,b;
		a=10;
		b=20;
		System.out.println("before a="+a+" b="+b);
		a=a-b;//-10
		b=a+b;//10
		a=b-a;
		System.out.println("after Swap a="+a+" b="+b);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
usingTwointeger();
	}

}
