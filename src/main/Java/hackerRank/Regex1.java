package hackerRank;

import java.util.Scanner;

public class Regex1 {

	
		// TODO Auto-generated method stub
		/*
		 * , then it is an invalid username.
The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits .
The first character of the username must be an alphabetic character, i.e., either lowercase character  or uppercase character .
For example:

Username	Validity
INVALID; Username length < 8 characters
VALID
VALID
INVALID; Username begins with non-alphabetic character
INVALID; '?' character not allowed
Update the value of regularExpression field in the UsernameValidator class so that the regular expression only matches with valid usernames.

Input Format

The first line of input contains an integer , describing the total number of usernames. Each of the next  lines contains a string describing the username. The locked stub code reads the inputs and validates the username.

Constraints

The username consists of any printable characters.
Output Format

For each of the usernames, the locked stub code prints Valid if the username is valid; otherwise Invalid each on a new line.

Sample Input 0

8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007
Sample Output 0

Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid
Explanation 0

Refer diagram in the challenge statement.
		 * 
		 */
		
		private static final Scanner scan = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        int n = Integer.parseInt(scan.nextLine());
	        while (n-- != 0) {
	            String userName = scan.nextLine();

	            if (userName.matches(UsernameValidator.regularExpression)) {
	                System.out.println("Valid");
	            } else {
	                System.out.println("Invalid");
	            }           
	        }
	    }

	

}
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}
