package interviewProgram;

public class HowtomanipulateArrayinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] days= {"Sunday","Monday","Tuesday","Thursday","Wednesday","Friday","Saturday"};
		String [] day=new String[days.length];
		for(int i=0;i<days.length;i++) {
			day[i]=days[i].substring(0,3);
		}
		
		for(String a : day) {
			System.out.println(a);
		}

	}

}
