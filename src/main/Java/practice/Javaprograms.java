package practice;

import java.util.Scanner;

public class Javaprograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Enter input one :");
		int a=input.nextInt();
		System.out.println("Enter input Two :");
		//int b=input.nextInt();
		System.out.println("Enter input Three :");
		//int c=input.nextInt();
		//Scanner input2= new Scanner(System.in);
		//System.out.println("Enter input two :");
		//int b=input.nextInt();
		System.out.println(smallest_number(a));
		
	    }
	
	public static int smallest_number(int a) {
		int total = 0;
		while(a>0) {
			int rem=a%10;
			total=rem+total;
			a=a/10;
		}
		
		
		return total;
	}

}
