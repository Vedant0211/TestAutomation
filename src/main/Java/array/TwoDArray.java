package array;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a[][]=new String [3][4];
		a[0][0]="A";
		a[0][1]="B";
		a[0][2]="C";
		a[0][3]="D";
		
		a[1][0]="E";
		a[1][1]="F";
		a[1][2]="G";
		a[1][3]="H";
		
		a[2][0]="I";
		a[2][1]="J";
		a[2][2]="K";
		a[2][3]="L";
		
		System.out.println(a.length);
		System.out.println(a[2].length);
		//print all 2d array value
		for(int row=0;row<a.length;row++) {
		System.out.println();
			for(int col=0;col<a[0].length;col++) {
				System.out.print(a[row][col]);
			}
		}
		
	}

}
