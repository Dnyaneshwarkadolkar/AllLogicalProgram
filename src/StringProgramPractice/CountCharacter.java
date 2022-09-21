package StringProgramPractice;

public class CountCharacter {
public static void main(String[] args) {
	
	String str="My name is Dnyaneshwar";
	int len=str.length();
int count=0;
	for(int i=0;i<len;i++) {
		if(str.charAt(i)!=' ') {
			count++;
		}
	}
	System.out.println(count);
	
}
}
