package LogicalProgramOfNumber;

import java.util.Scanner;

public class EvenAndOddDigitInNumber {
public static void main(String[] args) {
	int no;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number...");
	no=scan.nextInt();
	int ecount=0;
	int ocount=0;
	int eSum=0;
	int oSum=0;
	while(no>0) {
		int i=no%10;
		if(i%2==0) {
			ecount++;
			//System.out.println("The number is even number");
			eSum=eSum+i;
		}else {
			ocount++;
			oSum=oSum+i;
			//System.out.println("The number is odd number");
		}
		no=no/10;
	}
	System.out.println("The Even digit in number is "+ecount);
	System.out.println("The Odd digit in number is "+ocount);
	System.out.println("The sum of even number is.."+eSum);
	System.out.println("The sum of odd number is.."+oSum);
}
}
