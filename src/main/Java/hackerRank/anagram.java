package hackerRank;

public class anagram {
	
	static boolean isAnagram(String a, String b) {
        // Complete the function
        
         a=a.toLowerCase();
         b=b.toLowerCase();
      
        //Arrays.sort(a1);
        //Arrays.sort(b1);
        if(a.length()!=b.length()){
            return false;
        }
         // Create frequency arrays for the characters (assuming only English letters)
        int[] charCountA = new int[26]; // For 'a' to 'z'
        int[] charCountB = new int[26]; // For 'a' to 'z'

        // Count frequency of each character in the first string
        for (int i = 0; i < a.length(); i++) {
            charCountA[a.charAt(i) - 'a']++;
        }

        // Count frequency of each character in the second string
        for (int i = 0; i < b.length(); i++) {
            charCountB[b.charAt(i) - 'a']++;
        }

        // Compare the frequency arrays
        for (int i = 0; i < 26; i++) {
            if (charCountA[i] != charCountB[i]) {
                return false;
            }
        }

        return true;
        
            
        
      
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("abc", "bca"));

	}

}
