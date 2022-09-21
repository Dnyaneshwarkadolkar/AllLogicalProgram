package LogicalProgramOfNumber;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	
	int no;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	no=scan.nextInt();
	int fact=1;
	for(int i=1;i<=no;i++) {
	fact=fact*i;	
	}
	System.out.println(fact);
	
	
	
}
}
