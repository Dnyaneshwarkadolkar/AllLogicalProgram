package LogicalProgramOfarray;

public class SumOfallElementsinArray {
	public static void main(String[] args) {

		int a[] = { 10, 12, 4, 7, 9, 18 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);

	}
}
