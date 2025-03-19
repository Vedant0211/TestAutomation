package array;

import java.util.Arrays;
import java.util.Collections;

public class Sorttheelementsofanarrayinascendingorder {
	
	/**
     * Selection Sort
     * The main idea to keep finding the smallest element and put it the beginning of array.
     */
    public static void sSort(int[] arr) {
        // loop over each element of array
        for (int i = 0; i < arr.length; i++) {
            int mIndex = i;
            int min = arr[i];

            // find smallest index
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    mIndex = j;
                }
            }

            // swap the values of i and smallest element.
            int tmp = arr[i];
            arr[i] = arr[mIndex];
            arr[mIndex] = tmp;
        }
    }

    /**
     * Bubble Sort
     * In bubble sort we push the biggest elements to the end of array by switching pairs of elements
     * if they are not in correct order.
     */
    public static void bSort(int[] arr) {
        // set swapCounter to a non-zero value
	int swapCounter = -1;
		
	// repeat till the swap counter is not 0
	while (swapCounter != 0) {
		// reset swapCounter to 0
	    	swapCounter = 0;
			
	    	// Look at each adjacent pair
		for (int i = 0; i < arr.length - 1; i++) {
			// if two elements are not sorted swap them and add one to swapCounter
			if (arr[i] > arr[i + 1]) {
				int tmp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = tmp;
				swapCounter++;
			}
		}
	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {5,7,6,2,2,4,1,2,5,7,4,9};
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		//Arrays.sort(a);
		int temp=0;
		System.out.println(Arrays.toString(a));
		//Sort the array in ascending order    
        for (int i = 0; i < a.length; i++) {     
            for (int j = i+1; j < a.length; j++) {     
               if(a[i] > a[j]) {    
                   temp = a[i];    
                   a[i] = a[j];    
                   a[j] = temp;    
               }     
            }     
        }   
        
        
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {     
            for (int j = i+1; j < a.length; j++) {     
               if(a[i] < a[j]) {    
                   temp = a[i];    
                   a[i] = a[j];    
                   a[j] = temp;    
               }     
            }     
        }   
        System.out.println(Arrays.toString(a));
		
	}

}
