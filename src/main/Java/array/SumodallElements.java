package array;

public class SumodallElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,4,5,6};
		int total=0;
		for(int i=0;i<a.length;i++) {
			int sum=total+a[i];
			total=sum;
			
		}
		System.out.println(total);

	}

}
