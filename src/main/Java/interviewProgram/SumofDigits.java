package interviewProgram;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=64,r,sum=0;
		
		while(num>0) {
			r=num%10;
			sum=sum+r;
			num=num/10;
			
		}
		System.out.println(sum);
		
		
	}

}
