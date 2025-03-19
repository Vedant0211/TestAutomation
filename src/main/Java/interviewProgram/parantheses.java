package interviewProgram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.stream.IntStream;

public class parantheses {
	public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return "NO";
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return "NO";
                }
            }
        }
        
        return stack.isEmpty() ? "YES" : "NO";
    }
	
	public static boolean isBalanced2(String str) {
        // 'open parentheses' - { [ (
        // 'close parentheses' - } ]
        // We will use stack to monitor last 'open parentheses'
        Stack<Character> st = new Stack<>(); // stack is LIFO (Last In, First Out) data structure

        // loop over input string
        for (char ch : str.toCharArray()) {
            // if char is 'open parentheses' push to our stack
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);

                // if char is not open it might be 'close parentheses'
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                // get latest 'open parentheses'
                char latestOpenedPar = st.pop();

                // checking here if char was 'close parentheses' then latest 'open parentheses'
                // should be appropriate to close one.
                if (latestOpenedPar == '{' && ch != '}') { // this for curly braces
                    return false;
                } else if (latestOpenedPar == '(' && ch != ')') { // this for parentheses
                    return false;
                } else if (latestOpenedPar == '[' && ch != ']') { // for square braces
                    return false;
                }

                // note, there is no else becuase if no condition match then we can continue checking next chars
            }
        }
        // make sure stack is empty, if not it's not balanced(for last input in the example)
        return st.size() == 0;
    }



    public static void main(String[] args) throws IOException {
    	System.out.println(isBalanced2("[{()}]"));
//System.out.println(isBalanced2("(("));
    

}
}
