package interviewProgram;

public class Reversinteger {
	
	public static int revers(int a) {
		int num =a;
		int rev=0;
		while(num !=0) {
			rev=rev*10 + num % 10;
			num =num / 10;
		}		
		return rev;
	}
	
	public static void revers1(int a) {
		long num = a;
		System.out.println(new StringBuffer(String.valueOf(a)).reverse());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(revers(123654789));
revers1(1234567);
	}

}
