package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class OnlyGetKeysOfHashMap {
public static void main(String[] args) {
	
	HashMap<Integer,String>map=new HashMap<Integer,String>();
	map.put(10, "Ajay");
	map.put(15,"Kunal");
	map.put(20, "Vishal");
	map.put(25, "Krishna");
	map.put(30, "Abhie");
	
	Set<Integer>s=map.keySet();
	//System.out.println(s);
	for(Integer i:s) {
		//System.out.println(i);
	}
	//System.out.println(map.keySet());
	ArrayList<Integer>al=new ArrayList<Integer>(s);
	System.out.println(al);
}
}
