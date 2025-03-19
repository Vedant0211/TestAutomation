package interviewProgram;

public class MinimumDistancebetweenthegiventwoString {

	static int distanceoftwoString(String[] words,String word1, String word2) {
		int index1=-1 , index2=-1, mn=Integer.MAX_VALUE;
		
		for(int i=0;i<words.length;i++) {
			if(words[i].equals(word1)) {
				index1=i;
			}
			if(words[i].equals(word2)) {
				index2=i;
			}
			if(index1>=0 && index2>=0) {
				mn=Math.min(mn, Math.abs(index2-index1));
				break;
			}
			
		}
		
		return mn;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []words = { "the", "quick", "brown", "fox", "quick"};
		String word1 = "the",word2="fox";
		System.out.println(distanceoftwoString(words, word1, word2));
		
		

	}

}
