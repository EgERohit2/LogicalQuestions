//WAP for getting a square root of a given number

package logical;

public class SquareRoot {

	public static void main(String[] args) {

		int n = 36;

		for (int i = 1; i <= n; i++) {

			if (i * i == n) {
				System.out.println(i);
				break;
			}
		}
	}

}
