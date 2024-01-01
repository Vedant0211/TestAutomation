package interviewProgram;

public class PalindromNumber {
	public static void palindrom(int num) {
		int r ,sum ,t;
		r=0;
		sum=0;
		t=num;
		while(num>0) {
			r=num%10;// get the reminder
			sum =(sum*10)+r;
			num=num/10;
		}
		if(t==sum) {
			System.out.println("palindrom number");
		}else {
			System.out.println("not palidrom number");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		palindrom(101);
		
	}

}
