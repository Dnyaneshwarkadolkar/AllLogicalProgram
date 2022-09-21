package StringProgramPractice;

public class FoundDuplicates {
public static void main(String[] args) {
	String str="Programming";
	boolean status=false;
	char[]ch=str.toCharArray();
	
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<str.length();j++) {
			
			if(ch[i]==ch[j]) {
				status=true;
				System.out.println(ch[i]);
			}
		}
	}
	if(status==false) {
	System.out.println("Duplicates not found...");}
	System.out.println(str);
}
}
