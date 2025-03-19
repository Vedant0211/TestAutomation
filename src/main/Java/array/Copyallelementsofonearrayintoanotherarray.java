package array;

import java.util.Arrays;

public class Copyallelementsofonearrayintoanotherarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,4,5,6};
		int []b = new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +" ");
			
		}
		System.out.println();
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i] +" ");
		}

	}

}
