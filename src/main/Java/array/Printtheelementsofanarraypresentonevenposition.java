package array;

public class Printtheelementsofanarraypresentonevenposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={1, 2, 3, 4, 2, 7, 8, 8, 3 }; 
		
		for(int i=1;i<arr.length;i=i+2) {
			System.out.println(arr[i]);
		}

	}

}
