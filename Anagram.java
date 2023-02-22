//logic for anagram program with its time complexity. (for large strings)

package logical;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="hello everyone";
		String s2="oneeVERY heoll";
		
		s1=s1.replace(" ", "");
		s2=s2.replace(" ", "");
		
		char[]c1=s1.toLowerCase().toCharArray();
		char[]c2=s2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean res =Arrays.equals(c1, c2);
		
		if (res==true) {
			System.out.println("String is an anagram");
		}
		else {
			System.out.println("String is not an anagram");
		}
	}

}
