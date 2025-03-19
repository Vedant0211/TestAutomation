package hackerRank;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="He is a very very good boy, isn't he?";
		 // Scanner scan = new Scanner(System.in);
	       // String s = scan.nextLine().trim();
	        // Write your code here.
	        if (s.isEmpty()) {
	            System.out.println(0);
	            return;
	        }
	        String [] arr=s.split("[^A-Za-z]+");
	        if (arr.length == 0 || (arr.length == 1 && arr[0].isEmpty())) {
	            System.out.println(0);
	            return;
	        }
	        System.out.println(arr.length);
	        for(String a: arr){
	            
	            System.out.println(a);
	        }
	        
	        
	       // scan.close();

	}

}
