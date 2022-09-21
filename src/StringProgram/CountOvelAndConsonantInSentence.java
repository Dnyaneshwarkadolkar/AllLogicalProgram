package StringProgram;

public class CountOvelAndConsonantInSentence {
public static void main(String[] args) {
	int cCount=0,vCount=0;
	String str="This is really simple sentence";
	
	str=str.toLowerCase();
	
	for(int i=0;i<str.length();i++) {
		
		if(str.charAt(i)=='a'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='e') {
			vCount++;
			
		}else if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
			cCount++;
			
		}
	}
	System.out.println("The vowel count in sentence is >>"+vCount);
	System.out.println("The Consonant count in sentence is >>"+cCount);
	
	
	
	
}
}
