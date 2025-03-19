import java.util.HashMap;
import java.util.Map;

public class trtrtr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "vedantt";
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
		
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		int count=1;
		for(char ch: a.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, count+1);
			}else {
				map.put(ch, count);
			}
		}
		System.out.println(map.containsValue(2));
		
		
		
	}

}
