package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistconcept {
	
	

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] =new int[5]; //static array --size is fix
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		//Dynamic array
		ArrayList ar=new ArrayList();
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		ar.add(40);//3
		System.out.println(ar.size());
		ar.add(10);//4 //can contains duplicate value/element
		System.out.println(ar.size());
		//maintain insertion order
		//sycronized
		//allow   access to fetch the element because it stores the value on the index
		System.out.println(ar.get(4));
		//to print all the values from Array list
		//1.for loop
		//2.Using iterator
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//non generic vs generic
		ArrayList <Integer>ar1=new ArrayList<Integer>();
		ar1.add(10);
		//ar1.add("");
		ArrayList <String>ar2=new ArrayList<String>();
		ar2.add("test");
		ArrayList <E>ar3=new ArrayList<E>();
		
		Employ e1 =new Employ("vedant",28,"QA");
		Employ e2 =new Employ("vedant1",25,"dev");
		Employ e3 =new Employ("vedant2",29,"db");
		//create ArrayList
		ArrayList<Employ> ar4=new ArrayList<Employ>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator
		Iterator<Employ> it=  ar4.iterator();
		while(it.hasNext()) {
			Employ emp=it.next();
			System.out.print(emp.name);
			System.out.print(emp.age);
			System.out.println(emp.dept);
		}
		//addAll()
		ArrayList<String> ar5=new ArrayList<String>();
		ar5.add("test");
		ar5.add("test1");
		ar5.add("test2");
		
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("qa");
		ar6.add("qa1");
		ar6.add("qa2");
		
		ar5.addAll(ar6);
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		
		ArrayList<String> ar7=new ArrayList<String>();
		ar7.add("test");
		ar7.add("test1");
		ar7.add("test2");
		
		ArrayList<String> ar8=new ArrayList<String>();
		ar8.add("test");
		ar8.add("qa1");
		ar8.add("qa2");
		
		ar7.retainAll(ar8);
		for(int i=0;i<ar7.size();i++) {
			System.out.println(ar7.get(i));
		}
		
	}

}
