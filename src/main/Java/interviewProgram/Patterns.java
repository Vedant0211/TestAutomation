package interviewProgram;

public class Patterns {
	
	public static String pattern1(String a) {		
		for(int i=0;i<=4;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print(a);
			}
			System.out.println("");
		}
		return a;
	}
	
	public static String pattern2(String a) {	
		for(int i=0;i<=4;i++) {
			for(int k=4;k>=i;k--) {
				System.out.print(a);
			}
			
			System.out.println("");
		}
		return a;
	}
	
	public static String pattern3(String a) {		
		for(int i=0;i<=5;i++) {
			for(int k=4;k>=i;k--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(a);
			}
			System.out.println("");
		}
		return a;
	}
	
	public static String pattern3_2(String a) {		
		for(int i=0;i<=5;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print(a);
			}
			
			System.out.println("");
		}
		return a;
	}
	
	public static String pattern3_3(String a) {	
		for(int i=0;i<=5;i++) {
			for(int k=4;k>=i;k--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(a);
			}
			System.out.println("");
		}
		for(int i=0;i<=5;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--) {
				System.out.print(a);
			}
			
			System.out.println("");
		}
		return a;
	}
	
	public static String pattern4(String a) {		
		for(int i=0;i<=5;i++) {
			for(int k=4;k>=i;k--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(" "+a);
			}
			System.out.println("");
		}
		return a;
	}
	
	public static String pattern5(String a) {
		for(int i=0;i<=4;i++) 
		{
			for(int j=0;j<=i;j++) {
				System.out.print(a);
			}		
			System.out.println("");
		}
		for(int i=0;i<=3;i++) {
			for(int k=3;k>=i;k--) {
				System.out.print(a);
			}
			
			System.out.println("");
		}
		return a;
	}
	
	public static String pattern6(String a) {
		for(int i=0;i<=4;i++) {
			for(int k=4;k>=i;k--) {
				System.out.print(a);
			}
			System.out.println("");
		}
		for(int i=1;i<=4;i++) 
		{
			for(int j=0;j<=i;j++) {
				System.out.print(a);
			}		
			System.out.println("");
		}
		return a;
	}
	
	public static int Alphapattern1() {
		
		int alpha=65;
		for (int i=1; i<=5;i++ ) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)alpha+" ");
			}
			alpha++;
			System.out.println();
		}
		return alpha;
	}
	

	public static void main(String[] args) {
		System.out.println("====================Pattern 1======================");
		pattern1("*");
		System.out.println("====================Pattern 2======================");
		pattern2("*");
		System.out.println("====================Pattern 3======================");
		pattern3("*");
		System.out.println("====================Pattern 3_2======================");
		pattern3_2("*");
		System.out.println("====================Pattern 3_3======================");
		pattern3_3("*");
		System.out.println("====================Pattern 4======================");
		pattern4("*");
		System.out.println("====================Pattern 5======================");
		pattern5("*");
		System.out.println("====================Pattern 6======================");
		pattern6("*");
		System.out.println("====================AlphaPattern 6======================");
		Alphapattern1();
		// TODO Auto-generated method stub
		

	}

}
