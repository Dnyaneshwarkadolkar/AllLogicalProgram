package StringProgramPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {
	String str="Programming";
	
	Set<Character>set=new HashSet<Character>();
	for(int i=0;i<str.length();i++) {
		set.add(str.charAt(i));
	}
	
	for(char ch:set) {
		System.out.print(ch);
	}
}
}
