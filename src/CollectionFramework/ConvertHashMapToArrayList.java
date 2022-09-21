package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;

public class ConvertHashMapToArrayList {
public static void main(String[] args) {
	
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	map.put(10, "Kiran");
	map.put(12, "Arun");
	map.put(14, "Vijay");
	map.put(16, "Karan");
	map.put(18, "Kunal");
	System.out.println(map);
	
	//convert hashMap keys into ArrayList
	
	ArrayList<Integer> al=new ArrayList<Integer>(map.keySet());
	System.out.println(al);
	
	//convert hashMap values into ArrayaList
	
	ArrayList<String>al1=new ArrayList<String>(map.values());
	System.out.println(al1);
}
}
