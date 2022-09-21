package LogicalProgramOfNumber;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	 int no;
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the number..");
	 no=scan.nextInt();
	 int rev=0;
	 
	 while(no>0) {
		 
		 int i=no%10;
		 rev=rev*10+i;
		 no=no/10;
	
	 }
	 System.out.println(rev);
	 
	
	
	
	
}
}
