package interviewProgram;

public class CheckNumeric {
	
	public static boolean isNumberUsingRegularExpretionis10digi(String num) {
		return num.matches("[0-9]{10}");
	}
	
	public static boolean isEmpty(CharSequence cs) {
		return cs == null || cs.length() ==0;
	}
	public static boolean isNumeric(CharSequence cs) {
		if (isEmpty(cs)) {
			return false;
		}
		int len=cs.length();
		for(int i=0; i<len;i++) {
			if(!Character.isDigit(cs.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isNum(String num) {
		try {
			Long.parseLong(num);
			System.out.println("This number is valid number :- "+num);
		}catch(NumberFormatException e) {
			System.out.println("Not a Number "+num);
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isNumeric("1547d"));
		//System.out.println(isNumeric("234"));
		//isNum("123");
		System.out.println(isNumberUsingRegularExpretionis10digi("5896476985"));
		
		}

}
