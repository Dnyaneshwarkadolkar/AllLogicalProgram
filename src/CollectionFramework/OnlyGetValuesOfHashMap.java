package CollectionFramework;

import java.util.HashMap;
import java.util.Set;

public class OnlyGetValuesOfHashMap {
	public static void main(String[] args) {
		
	
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.put(17, "Ajay");
map.put(10,"Kiran");
map.put(15,"Ajay");
map.put(22,"Anil");
map.put(26,"Kunal");
//System.out.println(map);

Set<Integer>s=map.keySet();
for(int i:s) {
	System.out.println(map.get(i));
}
System.out.println(map.values());


}
}