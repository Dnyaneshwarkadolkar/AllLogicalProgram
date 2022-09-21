package LogicalProgramOfarray;

public class SortElementsInDescendingorder {
public static void main(String[] args) {
	int a[]= {17,89,45,23,15,17,10};
	int num;
for(int i=0;i<a.length;i++) {
	
	for(int j=i+1;j<a.length;j++) {
		
		if(a[i]<a[j]) {
			num=a[i];
			a[i]=a[j];
			a[j]=num;
		}
	}System.out.println(a[i]);
}
	
	
	
	
}
}
