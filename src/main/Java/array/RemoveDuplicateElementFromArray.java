package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={1, 2, 3, 4, 2, 7, 8, 8, 3 }; 
		Arrays.sort(arr);
		Set<Integer> unic=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			unic.add(arr[i]);
		}
		System.out.println(unic);
	}

}
