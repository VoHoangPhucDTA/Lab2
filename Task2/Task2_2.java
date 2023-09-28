package Task2;

public class Task2_2 {
	
	
	// pattern 1
	public static void drawPattern1(int n) {
		drawPattern1Help(n, 1);
	}
	
	public static void drawPattern1Help(int n, int i) {
		if (i > n) return;
		display(getRow1(i));
		System.out.println();
		drawPattern1Help(n, i+1);
	}
	
	
	public static int[] getRow1(int n) {
		int[] result = new int[n];
		for (int i = 0; i < result.length; i++) {
			result[i] = n;
		}
		return result;
		
	}
	
	
	// pattern 2
	
	public static void drawPattern2(int n) {
		drawPattern2Help(n, 1);
	}
	
	public static void drawPattern2Help(int n, int i) {
		if (i > n) return;
		display(getRow2(i));
		System.out.println();
		drawPattern2Help(n, i+1);
	}
	
	
	public static int[] getRow2(int n) {
		int[] result = new int[n];
		int index = 0;
		for (int i = 1; i <= n; i++) {
			result[index++] = i;
		}
		return result;
	}
	
	// pattern 3
	
	public static void drawPattern3(int n) {
		drawPyramidHelp3(n, 1);
	}
	
	public static void drawPyramidHelp3(int n, int i) {
		if (i > n) return;
		display(getRow3(i));
		System.out.println();
		drawPyramidHelp3(n, i+1);
	}
	
	
	public static char[] getRow3(int n) {
		char[] result = new char[n];
		for (int i = 0; i < result.length; i++) {
			result[i] = '*';
		}
		return result;
		
	}
	
	
	
	// pattern 4
	
	
	
	public static void drawPattern4(int n) {
		drawPyramidHelp4(n, 1);
	}
	
	public static void drawPyramidHelp4(int n, int i) {
		if (i > n) return;
		display(getRow4(i));
		System.out.println();
		drawPyramidHelp4(n, i+1);
	}
	
	
	public static int[] getRow4(int n) {
		int[] result = new int[2*n-1];
		int index = 0;
		for (int i = 1; i <= (2*n-1)/2; i++) {
			result[index] = i;
			result[2*n-2-index] = i;
//			System.out.println(result[index]);
//			System.out.println(result[n-1-index]);
			index++;
		}
		result[n-1] = (2*n-1)/2 + 1;
		return result;
		
	}
	
	

	// pattern 5
	
	public static void drawPattern5(int n) {
		drawPyramidHelp5(n, 1);
	}
	
	public static void drawPyramidHelp5(int n, int i) {
		if (i > n) return;
		display(getRow5(i,n));
		System.out.println();
		drawPyramidHelp5(n, i+1);
	}
	
	
	public static int[] getRow5(int row, int n) {
		int[] result = new int[2*row-1];
		int index = 0;
		for (int i = (2*row-1)/2; i >= 1; i--) {
			result[index] = n-i;
			result[2*row-2-index] = n-i;
			index++;
		}
		result[row-1] = n;
		return result;
	}
	
	// pattern 6
	public static void drawPattern6(int n) {
		drawPyramidHelp6(n, 1);
	}
	
	public static void drawPyramidHelp6(int n, int i) {
		if (i > n) return;
		display(getRow6(i,n));
		System.out.println();
		drawPyramidHelp6(n, i+1);
	}
	
	
	public static char[] getRow6(int row, int n) {
		char[] result = new char[n-row+1];
		for (int i = 0; i < result.length; i++) {
			result[i] = '*';
		}
		return result;
	}
	
	// pattern 7
	
	public static void drawPattern7(int n) {
		drawPattern7Help(n, 1);
	}
	
	public static void drawPattern7Help(int n, int i) {
		if (i > n) return;
		display(getRow7(i,n));
		System.out.println();
		drawPattern7Help(n, i+1);
	}
	
	
	public static int[] getRow7(int row, int n) {
		int[] result = new int[n-row+1];
		for (int i = 0; i < result.length; i++) {
			result[i] = n-row+1;
		}
		return result;
		
	}
	
	
	
	
	
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void display(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		int n = 9;
		System.out.println("Patter 1: ");
		drawPattern1(n);
		System.out.println();
		System.out.println();
		
		System.out.println("Patter 2: ");
		drawPattern2(n);
		System.out.println();
		System.out.println();
		
		System.out.println("Patter 3: ");
		drawPattern3(n);
		System.out.println();
		System.out.println();
		
		System.out.println("Patter 4: ");
		drawPattern4(n);
		System.out.println();
		System.out.println();
		
		
		System.out.println("Patter 5: ");
		drawPattern5(5);
		System.out.println();
		System.out.println();
		
		
		System.out.println("Patter 6: ");
		drawPattern6(n);
		System.out.println();
		System.out.println();
		
		System.out.println("Patter 7: ");
		drawPattern7(n);
		System.out.println();
		System.out.println();

	}

}
