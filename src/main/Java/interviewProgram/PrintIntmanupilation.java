package interviewProgram;

public class PrintIntmanupilation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3; // This will generate 3 pairs: 0|0 -1|1 -2|2

        // Initialize an empty string to store the sequence
        StringBuilder sequence = new StringBuilder();

        // Loop to generate the pairs
        for (int i = 0; i < n; i++) {
            sequence.append(i * -1).append("|").append(i);
            if (i < n - 1) {
                sequence.append(" ");
            }
        }

        // Print the generated sequence
        System.out.println(sequence.toString());
	}

}
