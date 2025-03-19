package interviewProgram;

import java.util.Arrays;

public class HowtocheckiftwostringsareANAGRAM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a , b;
		a="army";
		b="mary";
		
		char[] arr1 =a.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		System.out.println(arr1);
		char[] arr2 =b.toLowerCase().toCharArray();
		Arrays.sort(arr2);
		System.out.println(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Given string are anagram");		
		}else {
			System.out.println("Given string is not anagram");
		}

	}

}
