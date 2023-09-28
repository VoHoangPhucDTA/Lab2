package Task2;

public class Task2_1 {
	
	
	
	public static void drawPyramid(int n) {
		drawPyramidHelp(n, 1);
	}
	
	public static void drawPyramidHelp(int n, int i) {
		if (i > n) return;
		display(getRow(i));
		System.out.println();
		drawPyramidHelp(n, i+1);
	}
	
	
	public static char[] getRow(int n) {
		char[] result = new char[2*n-1];
		for (int i = 0; i < result.length; i++) {
			result[i] = 'X';
		}
		return result;
		
	}
	
	public static void display(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		drawPyramid(4);
	}
	
}
