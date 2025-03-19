package interviewProgram;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"sdsds","sdsds","sdsds","sdsd"};
		System.out.println(longestCommonPrefix(a));
	}

}
