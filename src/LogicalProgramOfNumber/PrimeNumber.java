package LogicalProgramOfNumber;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {

	int no;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number..");
	no=scan.nextInt();
	int count=0;
	for(int i=2;i<no;i++) {
		if(no%i==0) {
			count++;
		}
	}
	if(count==0) {
		System.out.println("The number is prime number");
	}else {
		System.out.println("The number is not prime number");
	}
	
}
}
