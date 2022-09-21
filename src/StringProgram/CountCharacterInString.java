package StringProgram;

public class CountCharacterInString {
public static void main(String[] args) {
	
	String str="To see the beauty of Pune city come in Ganapati Festival";
	int count=0;
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!=' ') {
			count++;
		}
	}
	System.out.println(count);
	
	
}
}
