package interviewProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LargestSubStringWithoutRepeatingChar {
	public static  int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (charIndex[s.charAt(right)] >= left) {
                left = charIndex[s.charAt(right)] + 1;
            }
            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
	public static int lengthOfLongestSubstringUsingSet(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        
        return maxLength;
    }
	 public static int lengthOfLongestSubstringUsingMap(String s) {
	        int n = s.length();
	        int maxLength = 0;
	        Map<Character, Integer> charMap = new HashMap<>();
	        int left = 0;
	        
	        for (int right = 0; right < n; right++) {
	            if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left) {
	                charMap.put(s.charAt(right), right);
	                maxLength = Math.max(maxLength, right - left + 1);
	            } else {
	                left = charMap.get(s.charAt(right)) + 1;
	                charMap.put(s.charAt(right), right);
	            }
	        }
	        
	        return maxLength;
	    }

	public static void main(String[] args) {
		
		System.out.println(lengthOfLongestSubstring("abcabcabc"));
		System.out.println(lengthOfLongestSubstringUsingSet("abcabcabc"));
		System.out.println(lengthOfLongestSubstringUsingMap("abcabcabc"));
		// TODO Auto-generated method stub

	}

}
