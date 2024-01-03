package interviewProgram;

public class Armstrong {
	
	public static void isarmstrong(int num) {
		int cube,r,t;
		cube =0;
		t=num;
		while(num>0) {
			r=num%10;
			num=num/10;
			cube = cube + (r*r*r);
		}
		if(t==cube) {
			System.out.println("this is armstrong number");
		}else {
			System.out.println("this is not armstrong number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isarmstrong(153);

	}

}
