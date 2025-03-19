package interviewProgram;

public class Findallsubsetsofastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "FUN";
		int len=a.length(),temp=0;
		 //Total possible subsets for string of size n is n*(n+1)/2  
		String[] sub=new String[len*(len+1)/2];
		 //This loop maintains the starting character  
        for(int i = 0; i < len; i++) {  
            //This loop adds the next character every iteration for the subset to form and add it to the array  
            for(int j = i; j < len; j++) {  
            	sub[temp] = a.substring(i, j+1);  
                temp++;  
            }  
        }
      //This loop prints all the subsets formed from the string.  
        System.out.println("All subsets for given string are: ");  
        for(int i = 0; i < sub.length; i++) {  
            System.out.println(sub[i]);  
        }  
		

	}

}
