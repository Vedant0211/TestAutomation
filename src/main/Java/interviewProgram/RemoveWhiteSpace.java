package interviewProgram;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="remove all space";
		String str1=str.replaceAll("\\s+", "");
		System.out.println("Remove spaces : -"+str1);

	}

}
