package Pattern;

public class HillPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {             //decreasing angle for space
				System.out.print(" ");
			}
			for(int k=1;k<i;k++) {             //right sided for * 
				System.out.print("*");	 		//just remove (k<=i)-> equal to sign 
			}									//after that it look like (k<i) 
			for(int l=1;l<=i;l++) {				//that will make one loop less for printing star for that star on top of the hill
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
