package interviewProgram;

public class ReversString {
	//using for loop
	public static String revers1(String a) {
		int len =a.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		return rev;
	}
	
	//using StringBuffer 
	public static StringBuffer revers2(String s) {
		StringBuffer sb= new StringBuffer(s);
		return sb.reverse();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(revers1("abcd"));
		System.out.println(revers2("vedant"));
	}

}
