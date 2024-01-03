package interviewProgram;

public class Factorial {
	
	public static int fatorial(int fact) {
		int factorial = 1;
		for(int i=1;i<=fact;i++) {
		factorial = factorial * i;
		}
		
		return factorial;
	}
	public static int fatorial1(int fact) {
		int factorial = 1;
		for(int i=fact;i>=1;i--) {
		factorial = factorial * i;
		}
		
		return factorial;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fatorial(5));
System.out.println(fatorial1(5));
	}

}
