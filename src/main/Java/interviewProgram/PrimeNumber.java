package interviewProgram;

public class PrimeNumber {
	public static boolean isPrimenumber(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2; i<num;i++) {
			if(num % i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		
		if(a%2==0) {
			System.out.println(a+" is not prime");
		}else if(a<=1){
			System.out.println(a+" is not prime");
		}else {
			System.out.println(a+" is prime");
		}
		
		System.out.println("this number is prime :"+isPrimenumber(3));

	}

}
