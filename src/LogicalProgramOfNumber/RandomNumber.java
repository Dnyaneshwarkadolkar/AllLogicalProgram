package LogicalProgramOfNumber;

public class RandomNumber {
public static void main(String[] args) {
	int min=100;
	int max=200;
	//Generate random int value from 200 to 400   
	System.out.println("Random value of type int between "+min+" to "+max+ ":");  

	int b = (int)(Math.random()*(max-min+1)+min);  
	
	System.out.println(b);  
	
	
}
}
