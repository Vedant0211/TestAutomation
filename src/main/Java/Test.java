import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "testdsdsbkdbbkjk";
		char[]b=a.toCharArray();
		HashMap<Character,Integer> char1=new HashMap<Character,Integer>();
		int count=1;
		for (int i=0;i<b.length;i++){
		if(char1.containsKey(b[i])){
		char1.put(b[i],char1.get(b[i])+1);
		}else{
		char1.put(b[i],1);
		}
		}
		System.out.println(char1);
		for(Character x: char1.keySet()) {
			//System.out.println("there count of word :"+x+"="+char1.get(x));
			if(char1.get(x)==1) {
				System.out.println("First non reapeting character :"+x+"="+char1.get(x));
				break;
			}
		}
		
		/*for (int i=0;i<a.length();i++){
		for(int j=1;j<a.length();j++){
		if(b[i]==b[j]){
		System.out.println("accerance character is:"+b[i]);
		}
		}
		}*/

	}

}
