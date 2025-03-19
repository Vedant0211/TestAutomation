import java.awt.Container;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {1,2,3,4,5,6,7}; 
		int b = 2547896;
		String b2=Integer.toString(b);
	    int len=Integer.toString(b).length();
		int revers = 0,reminder;
		String c= Integer.toString(b);
		StringBuffer rev= new StringBuffer(c);
		System.out.println(rev.reverse().toString());
		
		String rev1="";
		  for(int i=len-1;i>=0;i--) { 
			  
			  rev1 =rev1+b2.charAt(i);
		  
		  }
		  System.out.println(rev1);
		 
		while(b>0) {
			reminder=b%10;
			revers= (revers*10) + reminder;
			b=b/10;
			
		}
		System.out.println(revers);
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
		
		System.out.println(9/0.0);
		
		
		
		
		
			
	}

}
