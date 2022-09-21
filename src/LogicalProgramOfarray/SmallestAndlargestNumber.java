package LogicalProgramOfarray;

public class SmallestAndlargestNumber {
public static void main(String[] args) {
	int a[]= {12,12,15,65,43,29,70};
	
	int max =a[0];
	
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
		max=a[i];
	}}
	System.out.println(max);
	
	int min=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}}
		System.out.println(min);
	
	
}
}
