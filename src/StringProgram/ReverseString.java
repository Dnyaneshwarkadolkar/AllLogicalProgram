package StringProgram;

public class ReverseString {
public static void main(String[] args) {
	
	String str="RadhaKrishna";
	String rev=" ";
	
	int len=str.length();

	for(int i=len-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	
}
	
}
