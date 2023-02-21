//Code to find even numbers in a list

package logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> e = new ArrayList<>();
		for (int number : a) {
			if (number % 2 == 0) {
				e.add(number);
			}
		}
		System.out.println(e);
	}

}
