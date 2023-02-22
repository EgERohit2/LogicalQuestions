//WAP to print Fibonacci series with recursion

package logical;

public class FibonacciSeriesWithRecursion {
	static int a = 0;
	int b = 1;
	int c;

	void fibonacci(int i) {
		if (i>=1) {
			c=a+b;
			System.out.print(c+ " ");
			a=b;
			b=c;
			fibonacci(i-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FibonacciSeriesWithRecursion obj = new FibonacciSeriesWithRecursion();
		obj.fibonacci(10);
	}

}
