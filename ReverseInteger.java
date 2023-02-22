//WAP to reverse an integer without converting it to a string, without using any builtin methods.

package logical;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=123;
		int rev=0;
		
		while(n!=0) {
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		System.out.println(rev);
	}

}
