package interviewProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;

public class Logestsubstring_withoutRchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> data =new HashMap<Integer,String>();
		String a="asdfeaasd";
		int count =1;
		char[]b=a.toCharArray();
		String value = null,value2 = null;
		
		for(int i=0;i<b.length;i++) {
			char d = b[i];
			value=String.valueOf(d);
			for(int j=i+1;j<b.length;j++) {
				

				if(b[i]!=b[j]) {
					char c=b[j];
					value2=String.valueOf(c);
				   
				}else {
					break;
				}
				
				
			}
			String ans=value+value2;
			System.out.print(ans);
			
		}
	
		//System.out.println(data);
		
		
	}

}
