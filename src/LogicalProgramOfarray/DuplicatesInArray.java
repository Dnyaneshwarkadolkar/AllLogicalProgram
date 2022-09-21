package LogicalProgramOfarray;

public class DuplicatesInArray {
	public static void main(String[] args) {

		int a[] = { 10, 12, 14, 67, 32, 32, 12, 27 };
		System.out.println("Duplicates number in array is...");
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i + 1; j < a.length; j++) {
				
				if (a[i] == a[j]) {
					System.out.println(a[j]);

				}
			}

}






}
}