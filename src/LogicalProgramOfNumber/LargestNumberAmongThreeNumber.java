package LogicalProgramOfNumber;

import java.util.Scanner;

public class LargestNumberAmongThreeNumber {
public static void main(String[] args) {
	int a,b,c;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the first number");
	a=scan.nextInt();
	System.out.println("Enter the second number");
	b=scan.nextInt();
	System.out.println("Enter the third number");
	c=scan.nextInt();
	if(a>b && a>c) {
		System.out.println("First number is largest than other numbers");
	}else if(b>c && b>a){
		System.out.println("Second number is largest than other numbers");
		
	}else {
		System.out.println("Third number is largest no");
	}
	
	
}
}
