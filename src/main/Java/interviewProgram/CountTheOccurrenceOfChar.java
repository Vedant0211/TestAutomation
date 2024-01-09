package interviewProgram;

public class CountTheOccurrenceOfChar {
	
	//charArray -- for loops
	public static void usingcharArrayCountOcc(String str, char val) {
		int count =0;
		for(char ch : str.toCharArray()) {
			if(ch == val) {
				count++;
			}
		}
		System.out.println(val +":"+count);
	}
	//str.len--charAt(i)
	public static void getcharcount(String str, char val ) {
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == val) {
				count++;
			}
		}
		System.out.println(val +":"+count);
	}
	//Stream
	public static void getcountofcharusingStreams(String str,String val) {
		long count=str.chars()
					  .mapToObj(e -> String.valueOf((char)e))
					  .filter(e->e.equals(val))
					  .count();
		System.out.println(val +":"+count);
	}
	public static void main(String[] args) {
		String str="I love automation";
		// TODO Auto-generated method stub
		usingcharArrayCountOcc(str, 'a');
		getcharcount(str, ' ');
		getcountofcharusingStreams(str, "o");
	}

}
