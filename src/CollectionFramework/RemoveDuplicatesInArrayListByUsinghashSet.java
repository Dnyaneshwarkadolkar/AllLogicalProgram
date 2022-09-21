package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicatesInArrayListByUsinghashSet {
public static void main(String[] args) {
	
	ArrayList<Integer>al=new ArrayList<Integer>();
	al.add(10);
	al.add(15);
	al.add(18);
	al.add(16);
	al.add(10);
	al.add(15);
	System.out.println(al);
	
HashSet set=new HashSet(al);
System.out.println(set);
}
}
