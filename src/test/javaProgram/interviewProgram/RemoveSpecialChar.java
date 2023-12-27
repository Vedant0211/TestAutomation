package interviewProgram;

public class RemoveSpecialChar {
	
	
	public static String remove1(String s) {
		//regular Expression [^a-zA-Z0-9]
		s=s.replaceAll("[^a-zA-Z0-9]", "");
	return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(remove1("@#$%%#$#vedantAmberkar0211"));
	}

}
