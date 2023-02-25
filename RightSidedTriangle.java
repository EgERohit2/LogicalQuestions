//Right-sided triangle

package Pattern;

public class RightSidedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		
		for (int i = 1; i <= n; i++) {              //loop from 1 to 5   
			for (int j = i; j <= n; j++) {			//decreasing triangle
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {			//Increasing triangle
				System.out.print("* ");

			}
			System.out.println(" ");
		}
		
	}

}
