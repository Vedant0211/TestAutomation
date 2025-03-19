package interviewProgram;

public class Stringcompression {
	
	public static String compressString(String input) {
        StringBuilder compressed = new StringBuilder();
        int length = input.length();

        for (int i = 0; i < length; i++) {
            char currentChar = input.charAt(i);
            int count = 1;

            // Count consecutive occurrences of the same character
            while (i + 1 < length && input.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }

            // Append the character and its count
            compressed.append(currentChar);
            compressed.append(count);
        }

        return compressed.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(compressString("vedant amberkar"));
	}

}
