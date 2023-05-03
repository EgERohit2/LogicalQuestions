package logical;

import java.util.Collections;
import java.util.Vector;
import java.util.stream.Collectors;

public class VectorSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v = new Vector<>();
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		System.out.println(v);
		System.out.println("after swapping");
		Collections.swap(v, 0, 2);
		System.out.println(v);
	}

}
