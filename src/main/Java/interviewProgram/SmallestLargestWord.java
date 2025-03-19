package interviewProgram;

import java.util.Arrays;

import org.apache.commons.math3.analysis.function.Min;

public class SmallestLargestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Hardships often prepare ordinary people for an extraordinary destiny"; 
		 
		 String [] a= str.split("\\s+");
		 System.out.println(Arrays.toString(a));
		// int Small = 0,large = 0;
		 
		 String large = "" ,small = "";
			 
			 for(String word : a) {
				//b=word; 
			// int lenofw =word.length();
			  if (word.length()<small.length()||small.length()==0) {
				  small=word;
			  }else if (word.length()>large.length()) {
				  large=word;
				;
			  }
		 
			 
			 }
			 System.out.println(small);
			 System.out.println(large);
		 
	}

}
