package StringProgramms;

public class UppercasePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ITs SiMpLE";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {

				System.out.print(c);

			}
		}
	}

}
