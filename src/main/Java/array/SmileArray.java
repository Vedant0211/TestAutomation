package array;

import java.util.Arrays;

public class SmileArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] =new int[4];
		i[0]=1;
		i[1]=2;
		i[2]=3;
		i[3]=4;
		//System.out.println(i[3]);
		
		for(int j=0; j<i.length;j++) {
			System.out.println(i[j]);
		//	array to store similar data type value in a array variable
			// disadvantage
			// size is fixed-- static array to overcome this problem -- we use Collections -- ArrayList,hashTable -- use   
		    // stores only similar data types
			
		}
		
		Object t[] = new Object[5];
		t[0]="test";
		t[1]="1/1/2000";
		t[2]=34;
		t[3]=34.5;
		t[4]='m';
		System.out.println(t[1]);
		System.out.println(t.length);
		System.out.println(Arrays.toString(t));
		
		String a="automation testing";
				String b[]=a.split("");
				System.out.println(Arrays.toString(b));
				for(int k=0;k<b.length;k++) {
					for(int j=k+1;j<b.length;j++) {
						if(b[k].equals(b[j])) {
						System.out.println(b[j]);
						break;
						}
						
					}
					
				}

	}

}
