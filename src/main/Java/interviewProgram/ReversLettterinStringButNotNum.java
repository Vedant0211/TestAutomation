package interviewProgram;

public class ReversLettterinStringButNotNum {
	
	public static String reverseLettersInString(String input) {
        StringBuilder result = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else {
                if (letters.length() > 0) {
                    result.append(letters.reverse());
                    letters.setLength(0); // clear letters buffer
                }
                result.append(ch);
            }
        }
        
        // Append remaining letters if any
        if (letters.length() > 0) {
            result.append(letters.reverse());
        }

        return result.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseLettersInString("test12abc20zxc30"));

	}

}
