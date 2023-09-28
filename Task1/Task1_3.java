package Task1;

public class Task1_3 {

	public static int getToHop(int n, int k) {
		int tuSo = factorial(n);
		int mauSo = factorial(n-k) * factorial(k);
		int result = tuSo / mauSo;
		return result;
	}

	// This method is used to display a Pascal triangle based
	// on the parameter n.
	// Where n represents the number of rows
	
	public static int factorial(int n) {
		int result = 1;
		for (int i = 1; i<= n; i++) {
			result *= i;
		}
		return result;
	}
	
	
	public static void printPascalTriangle(int row) {
		printPascalTriangleHelp(row, 0);
	}
	
	
	
	
	public static void printPascalTriangleHelp(int row, int i) {
		if (i >= row) return;
		display(generateNextRow(getPascalTriangle(i)));
		System.out.println();
		printPascalTriangleHelp(row, i+1);
	}


	
	// get the nth row.
	// For example: n=1 ==> {1}, n=2 ==> {1, 1}, ...
	public static int[] getPascalTriangle(int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = getToHop(n-1, i);
		}
		return result;
	}

	

	public static int[] generateNextRow(int[] prevRow) {
		int n = prevRow.length + 1;
		int[] result = new int[n];
		result[0] = 1;
		result[n-1] = 1;
		for (int i = 1; i < n-1; i++) {

			result[i] = prevRow[i-1] + prevRow[i];
		}
		
		return result;
	}
	
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int n = 6, k = 2;
		System.out.println("Với n = " + n + " và k = " + k) ;
		
		System.out.println();
		System.out.print("Hàng thứ n: ");
		display(getPascalTriangle(n));
		System.out.println();
		System.out.println();
		
		
		System.out.print("Hàng thứ n+1: ");
		display(generateNextRow(getPascalTriangle(n)));
		System.out.println();
		System.out.println();
		
		
		System.out.print("In tam giác pascal: ");
		System.out.println();
		printPascalTriangle(n);
	}
}