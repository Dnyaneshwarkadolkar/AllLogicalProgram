package LogicalProgramOfarray;

public class ArrayInReverseOrder {
public static void main(String[] args) {
	
	int a[]= {1,2,3,4,5,6};
	System.out.println("In original order");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	System.out.println();
	System.out.println("Array in reverse orsder");
	for(int i=a.length-1;i>=0;i--) {
		System.out.println(a[i]);
	}
	
	
	
	
	
}
}
