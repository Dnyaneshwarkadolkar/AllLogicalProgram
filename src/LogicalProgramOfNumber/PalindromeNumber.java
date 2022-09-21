package LogicalProgramOfNumber;

public class PalindromeNumber {
public static void main(String[] args) {
	
	int no=1234321;
	int rev=0;
	int pno;
	pno=no;
	while(no>0) {
		int i=no%10;
		rev=rev*10+i;
	no=no/10;
	}
	System.out.println("the reverse number is  .."+rev);
	if(pno==rev) {
		System.out.println("The number is Palindrome number...");
	}else {
		System.out.println("The number is not palindrome number");
	}
}
}
