package StringProgram;

public class RemoveWhiteSpaces {
public static void main(String[] args) {
	
	String str="Remove White Spaces in sentences";
	
	str=str.replaceAll("\\s+", "");
	
	System.out.println(str);
	
	
}
}
