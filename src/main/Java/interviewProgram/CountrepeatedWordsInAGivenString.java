package interviewProgram;

import java.util.HashMap;
import java.util.Map;

public class CountrepeatedWordsInAGivenString {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String words="i am java java am testing";
		
		count_wordusingmap(words);
		System.out.println(count_Words(words));
		;

	}
	public static void count_wordusingmap(String words) {
		Map<String,Integer> map= new HashMap<String,Integer>();
		Integer count=1;
		String[] arr=words.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i],count);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(String x: map.keySet()) {
			System.out.println("there count of word :"+x+"="+map.get(x));
		}
	}
	
	 public static int count_Words(String str)
	    {
	       int count = 0;
	        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
	        {
	            for (int i = 0; i < str.length(); i++)
	            {
	                if (str.charAt(i) == ' ')
	                {
	                    count++;
	                }
	            }
	            count = count + 1; 
	        }
	        return count; // returns 0 if string starts or ends with space " ".
	    }

}
