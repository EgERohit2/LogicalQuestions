package logical;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int sum = 0;
		for (int n = 1; n <= 100; n++) {

			for (int i = n+1; i <= n; i++) {
				if (n % i == 0) {
					count++;

				}

			}
			if (count == 2) {
				sum = sum + n;
			}

		}
		System.out.println(sum);
	}

}
