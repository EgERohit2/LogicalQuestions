//WAP which moves each letter by 2

package StringProgramms;

public class EncodingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "SIMPLY";
		String enc = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLetter(c)) {
				c += 3;
				if ((Character.isUpperCase(s.charAt(i)) && c > 'Z')
						|| (Character.isLowerCase(s.charAt(i)) && c > 'z')) {
					c -= 26;
				}
			}
			enc += c;
		}
		System.out.println(enc);
	}
}
