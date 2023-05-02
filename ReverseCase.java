//WAP to reverse the case of the string

package StringProgramms;

public class ReverseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ItS 201 SimpLe";
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				r = r + Character.toLowerCase(c);
			} else {
				r = r + Character.toUpperCase(c);
			}
		}
		System.out.println(r);
	}

}
