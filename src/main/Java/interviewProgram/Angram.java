package interviewProgram;

import java.util.Arrays;

public class Angram {
	  public static void main(String[] args) {
	        twoStringAreAnagram("triangle","integral");
	        anagram("triangle","integral");
	    }
	  
	  public static void anagram(String a, String b) {
		  if(a.length()!=b.length()) {
			  System.out.println("it is not angram");
		  }else {
			  char [] cr1=a.toLowerCase().toCharArray();
			  char [] cr2=b.toLowerCase().toCharArray();
			  Arrays.sort(cr1);
			  Arrays.sort(cr2);
			  if(cr1==cr2) {
				  System.out.println("it is angram");
			  }
		  }
	  }
	  
	  
	  
	  
	  
	  
	    public static void twoStringAreAnagram(String str1,String str2){
	        if (!(str1.length()==str2.length())){
	            System.out.println("Strings are not Anagram");
	        }
	        else {
	            char[] c1=str1.toLowerCase().toCharArray();
	            char[] c2=str2.toLowerCase().toCharArray();
	            Arrays.sort(c1);
	            Arrays.sort(c2);
	            if(c1[1]==(c2[1])){
	                System.out.println("Strings are Anagram");
	            }
	            else {
	                System.out.println("Strings are not Anagram");
	            }
	        }
	    }

}
