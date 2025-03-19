package interviewProgram;

public class CountVowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="vedant amberkar";
		int vowelCount = 0,charCount=0;
		for(int i=0;i<a.length();i++) {
			//Checks whether a character is a vowel    
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
				vowelCount++;
			}
			//Checks whether a character is a consonant    
			else if(a.charAt(i)>='a'&&a.charAt(i)<='z') {
				charCount++;
			}
		}
		System.out.println("Vowels count " +vowelCount);
		System.out.println("Character count " +charCount);
		

	}

}
