package array;

import java.util.Arrays;

public class LargestelementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {45,58,14,56,96,25};
		int largest=0;
		for (int i=0;i<a.length;i++) {
			for(int j=1;j<a.length;j++) {
				if(a[i]<a[j]) {
					 largest=a[j];
				}
			}
		}
		//System.out.println(largest);
		
		
		int max=a[0];
		int min=a[0];
		int SndMax = 0,Sndmin=0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				SndMax=max;
				max=a[i];
			}else if(a[i]>SndMax&&max>a[i]) {
				SndMax=a[i];
			}
			if(min>a[i]) {
				Sndmin=min;
				min=a[i];
			}
			else if(a[i]<Sndmin&&min<a[i]) {
				Sndmin=a[i];
			}
		}
		System.out.println(max);
		System.out.println(SndMax);
		System.out.println(min);
		System.out.println(Sndmin);
		
		
		Arrays.sort(a);
		int thrd=a[a.length-3];
		System.out.println(thrd);
		int thrdsmall=a[2];
		System.out.println(thrdsmall);


	}

}
