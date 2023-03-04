package Pattern;

public class DownHillPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {             	// increasing triangle for spacing
				System.out.print(" ");
			}
			for(int k=i;k<n;k++) {					//decreasing triangle for star (note k<n)
				System.out.print("*");
			}
			for(int l=i;l<=n;l++) {					//decreasing triangle for star
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
