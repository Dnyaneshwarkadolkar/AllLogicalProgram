package LogicalProgramOfNumber;

import java.util.Scanner;

public class FactorsOfNumber {
public static void main(String[] args) {
	int no;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	no=scan.nextInt();
	
	for(int i=1;i<=no;i++) {
	if(no%i==0) {
		System.out.print(" "+i);
	}
	
	}scan.close();
	
	
	
	
	
}
}
