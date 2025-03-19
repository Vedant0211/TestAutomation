package interviewProgram;

public class UppercaseandLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Vedant Amberkar";
		String b=a.toLowerCase();
		System.out.println("lowercase :- "+b);
		String c=a.toUpperCase();
		System.out.println("Uppercase :- "+c);
		StringBuffer newstr= new StringBuffer(a);
		for(int i=0;i<a.length();i++) {
			if(Character.isLowerCase(a.charAt(i))) {
				newstr.setCharAt(i, Character.toUpperCase(a.charAt(i)));
			}else if(Character.isUpperCase(a.charAt(i))){
				newstr.setCharAt(i, Character.toLowerCase(a.charAt(i)));
			}
		}
		
		System.out.println("lower to upper and upper to lower :- "+newstr);
		

	}

}
