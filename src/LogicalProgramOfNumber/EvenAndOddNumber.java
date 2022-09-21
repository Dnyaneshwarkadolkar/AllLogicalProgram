package LogicalProgramOfNumber;

import java.util.Scanner;

public class EvenAndOddNumber {
public static void main(String[] args) {
	long no;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number...");
	no=scan.nextInt();
	
	if(no%2==0) {
		System.out.println("The numer is even number");
	}else {
		System.out.println("The number is odd number");
	}
	System.out.println("The number is >>"+no);
}
}
