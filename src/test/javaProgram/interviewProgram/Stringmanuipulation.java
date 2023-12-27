package interviewProgram;

public class Stringmanuipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="the rains have started here";
		String str1="the rains have started Here";
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s', 9));
		System.out.println(str.indexOf('s', str.indexOf('s')+1));
		System.out.println(str.indexOf("have"));
		System.out.println(str.indexOf("dsdsdd"));
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.substring(0,8));
		
		String trim="      the test     ";
		System.out.println(trim.trim());
		
		System.out.println(str.replace(" ", ""));
		
		//split
		String test="hello_world_test_selenium";
		String testval []=test.split("_");
		for(int i=0;i<testval.length;i++) {
			System.out.println(testval[i]);
		}
		}

}
