//create a string with digits first and then characters.

package StringProgramms;

public class DigitsAndCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ItS 201 SimpLe";
		String d = "", r = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				d = d + c;
			} else {
				r = r + c;
			}
		}
		String n =d+r;
		System.out.println(n);
	}

}
