package StringProgram;

public class CountWhiteSpaces {
public static void main(String[] args) {
	int count=0;
	String str="Welcome in pune city";
	str=str.toLowerCase();
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' ') {
			count++;
		}
	}
	System.out.println("White Spaces in String is >> "+count);
}
}
