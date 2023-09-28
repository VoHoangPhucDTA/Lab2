package Task1;

public class Task1_2 {
	
	
	public static int getFibonanci(int n) { 
		if (n == 0 || n == 1) return n;
		int sum1 = getFibonanci(n-1);
		int sum2 = getFibonanci(n-2);
		return sum1 + sum2;
	}
	
	
	public static void printFibonanci(int n) {
		for (int i = 0; i <= n; i++) {
			System.out.print(getFibonanci(i) + " ");
		}
	}
	
	
	public static void main(String[] args) {
		int n = 8;
		System.out.println("Số Fibonanci thứ n: " + getFibonanci(n));
		printFibonanci(n);
	}
}	
