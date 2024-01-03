package interviewProgram;

public class SwapTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "vedant";
		String b= "amberkar";
		System.out.println("before swap value of a="+a+" b="+b);
		 a=a+b;
		 
		 b=a.substring(0,a.length()-b.length());
		 a=a.substring(b.length());
		 
		 System.out.println("ther value of a and be after swapping");
		 System.out.println("the value of a = "+a);
		 System.out.println("the value of b = "+b);

	}

}
