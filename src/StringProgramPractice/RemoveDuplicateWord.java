package StringProgramPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {
public static void main(String[] args) {
	String str="My name Dnyaneshwar name My";
	String []s=str.split(" ");
	
	Set<String>set=new LinkedHashSet<String>();
	for(String s1:s) {
		set.add(s1);
	}
	Iterator<String>itr=set.iterator();
	while(itr.hasNext()) {
		System.out.print(itr.next()+" ");
	}
	
}
}
