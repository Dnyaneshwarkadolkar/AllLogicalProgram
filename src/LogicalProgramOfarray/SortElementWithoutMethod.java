package LogicalProgramOfarray;

public class SortElementWithoutMethod {
public static void main(String[] args) {
	
	int a[]= {10,26,354,82,89,-9,17,10};
	int num;
	for(int i=0;i<a.length;i++) {
		
		for(int j=i+1;j<a.length;j++) {
			
			if(a[i]>a[j]) {
				num=a[i];
				a[i]=a[j];
				a[j]=num;
			}
			
			
			
		}System.out.println(a[i]);
	}
	
}
}
