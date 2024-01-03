package interviewProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] ={"java", "javaStript","ruby","c","java"};
	//1. compare each element
		for(int i=0; i<name.length;i++) {
			for(int j =i+1;j<name.length;j++) {
				if(name[i].equals(name[j])) {
					System.out.println("duplicate element is : "+name[i]);
				}
			}
		}
		
		
		// 2 using hashSet: is part of java collection it store unique value
		Set<String> Store = new HashSet<String>();
		for(String names: name ) {
			if(Store.add(names)==false) {
				System.out.println("Duplicate element is : "+names);
			}
		}
		
		
		Map<String,Integer> storemap=new HashMap<String,Integer>();
		for(String names:name) {
		Integer count =storemap.get(names);
		if(count==null) {
			storemap.put(names, 1);
		}else {
			storemap.put(names, ++count);
		}
		}
		
		//get the value from this hashmap
		Set<Entry<String,Integer>> enterset=storemap.entrySet();
		for(Entry<String,Integer> entry : enterset) {
			if(entry.getValue()>1) {
				System.out.println("duplicate element is : "+ entry.getKey());
			}
		}
	
	
	
	}

}
