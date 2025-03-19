package interviewProgram;

import java.util.Arrays;

public class LargestAndsmallestPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Wow   you  own       kayak";
		String [] arr= str.split("\\s+");
		System.out.println(Arrays.toString(arr));
		String Small="",large="";
		
		for(String word : arr) {
			StringBuffer rev = new StringBuffer(word);
			String reverse= rev.reverse().toString();
			if(word.equals(reverse)&&word.length()<Small.length()||Small.length()==0) {
				Small=word;
			}else if(word.equals(reverse)&&word.length()>large.length()) {
				large=word;
			}
			
			
		}
		System.out.println(Small);
		System.out.println(large);

	}

}
