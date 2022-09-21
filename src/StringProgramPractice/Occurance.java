package StringProgramPractice;

import java.util.HashMap;
import java.util.Map;

public class Occurance {
public static void main(String[] args) {
	String str="My name is Dnyaneshwar123123";
	String s=str.replaceAll("\\s", "");
	
  char[] chars=s.toCharArray();
	Map<Character,Integer>map=new HashMap<Character,Integer>();
	for(Character ch:chars) {
		if(!map.containsKey(ch)) {
			map.put(ch, 1);
		}
		else {
			Integer value=map.get(ch);
			map.put(ch, value+1);
		}
	}
	System.out.println(map);
}
}
