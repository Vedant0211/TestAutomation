package interviewProgram;

import java.nio.file.spi.FileSystemProvider;

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
	public static String revers2(String s) {
		StringBuffer sb= new StringBuffer(s);
		return sb.reverse().toString();
	}

	public static void reversWords(String a) {
		String b[]=a.split(" ");
		for (int i=b.length-1; i>=0;i--) {
			System.out.print(b[i]+" ");
		}
	}
	
	//s.trim(): delete the leading or trailing spaces.
	//s.trim().split("\s+"): split the words separated by 1 space or multiple spaces in the input string
	//Create a String array to store the all the separated words
	//Create a StringBuilder to modify the answer string
	//Add words from the end of the array and add spaces (except for the first word) at the same time
	//Return the answer by convert it to String
	public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            ans.append(words[i]);
            if(i != 0){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
	
	
	public static void ReverseaStringinJavaWordbyWord(String a) {
		String [] b=a.split("\\s+");
		
		for(int i = b.length-1;i>=0;i--) {
			String rev=b[i];	
			
			StringBuffer reverse = new StringBuffer(rev);
			System.out.print(reverse.reverse() +" ");
			}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(revers1("abcd"));
		//System.out.println(revers2("vedant"));
		ReverseaStringinJavaWordbyWord("vedant anbeadsn sdsbdsa yasbdbsa");
		
		//reversWords("did you know chat");
	}

}
