//Swap Values without using any variable a=10, b=12

package logical;

public class SwapVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 12;
		System.out.println("Before Swapping :" + a);
		System.out.println("Before Swapping :" + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping :" + a);
		System.out.println("After Swapping :" + b);

	}

}
