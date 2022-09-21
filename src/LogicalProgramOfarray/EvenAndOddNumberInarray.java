package LogicalProgramOfarray;

public class EvenAndOddNumberInarray {
public static void main(String[] args) {

	 int a[]= {10,23,14,21,05,7,8};
	System.out.println("Even number");
	
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			System.out.println(a[i]);
		}
	}
	System.out.println("Odd number");
	for(int j=0;j<a.length;j++) {
		if(a[j]%2!=0) {
			System.out.println(a[j]);
		}
	}
	
	
	
}
}
