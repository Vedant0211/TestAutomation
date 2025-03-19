package interviewProgram;

public class DivideString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="aaaabbbbcccc";
		int n=3, len=str.length() , temp =0 , chars=len/n;
		String[] equalstr= new String[n];
		if(len%n != 0) {
			System.out.println("");
		}else {
			for(int i=0;i<len;i=i+chars) {
				String part =str.substring(i,i+chars);
				equalstr[temp]=part;
				temp++;
			}
		}
		System.out.println(n+ " equal part of given String are ");
		for(int i=0;i<equalstr.length;i++) {
			System.out.println(equalstr[i]);
		}

	}

}
