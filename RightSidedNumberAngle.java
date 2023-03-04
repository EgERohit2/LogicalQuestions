package Pattern;

public class RightSidedNumberAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i);       // to make it complete triangle just add space 
			}								//after the star i.e. System.out.print("*");
			System.out.println();
		}
	}

}
