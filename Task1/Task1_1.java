package Task1;

public class Task1_1 {

	// S(n)=1 - 2 + 3 - 4+…+ ((-1)^(n+1) ).n , n>0
	
	
	public static int getSn1(int n) {
		if (n == 0) return 0;
		return (int) ((Math.pow(-1, n+1)*n) + getSn1(n-1));
	}
	

	
	// S(n)= 1+ 1.2 + 1.2.3 +…+ 1.2.3…n, n>0
	public static int getSn2(int n) {
		if (n == 1) return 1;
		return factorial(n) + getSn2(n-1);
	}
	
	
	
	
	// S(n)= 1^2 + 2^2 + 3^2 +.... +n^2 , n>0
	public static int getSn3(int n) {
		if (n == 1) return 1;
		return (int) (Math.pow(n, 2) + getSn3(n-1));
	}

	// S(n)= 1 + 1/2 + 1/(2.4) + 1/(2.4.6)+… +1/(2.4.6.2n), n>=0
	public static double getSn4(int n) {
		if (n == 0) return 1.0; 
		double mauSo = 1.0;
		for (int i = 0; i < n; i++) {
			mauSo = mauSo * (2*i+2);
		}
		return (1.0 / mauSo) + getSn4(n-1);
	}
	
	
	public static int factorial(int n) {
		if (n == 1) return 1;
		return n * factorial(n-1);
	}
	
	

	
	public static void main(String[] args) {
		int n = 5;
		System.out.println("Tổng sum1: " + getSn1(n));
		System.out.println();
		
		System.out.println("Tổng sum2: " + getSn2(n));
		System.out.println();
		
		System.out.println("Tổng sum3: " + getSn3(n));
		System.out.println();
		
		System.out.println("Tổng sum4: " + getSn4(1));
		System.out.println();
		
		
	}
}
