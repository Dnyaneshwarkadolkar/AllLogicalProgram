package LogicalProgramOfNumber;

import java.util.Scanner;

public class SwapNumber {
public static void main(String[] args) {
	int a;
	int b;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the first number");
	a=scan.nextInt();
	System.out.println("Enter the second number");
	b=scan.nextInt();
	
	/*int t=a;
	a=b;
	b=t;*/
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("First number"+a);
	System.out.println("First number"+b);
}
}
