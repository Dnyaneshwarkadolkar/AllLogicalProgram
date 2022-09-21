package LogicalProgramOfNumber;

import java.util.Scanner;

public class SumOfDigitsInNumber {
public static void main(String[] args) {
	long no;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number..");
	no=scan.nextLong();
	long sum=0;
	
	while(no>0) {
		long i=no%10;
		sum=sum+i;
		no=no/10;
	}
	
	System.out.println("The sum of all digits in number is.."+sum);
}
}
