package interviewProgram;

import java.util.Arrays;

public class LargestNumberandSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]= {-23,45,78,444};
		int largest=number[0];
		int Smallest=number[0];
		for(int i=1;i<number.length;i++) {
			if(number[i]>largest) {
				largest=number[i];
			}else if(number[i]<Smallest) {
				Smallest=number[i];
			}
		}
		System.out.println(Arrays.toString(number));
		System.out.println("largest number is "+largest);
		System.out.println("Smallest number is "+Smallest);
	}

}
