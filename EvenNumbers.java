package logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> number = Arrays.asList(1,2,4,5,7,8);
		List num=number.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(num);
	}

}
