package interviewProgram;

public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("fibonaci series");
		int n1=0,n2=1,n3,count1=10;
		
		for(int i=2;i<count1;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
	}

}
