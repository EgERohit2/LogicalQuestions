package StringProgramms;

public class OnlyUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Its sImPle";
		int count=0;
		String n = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				n = n + c;
				count++;
			}

		}
		// System.out.println(n);
		System.out.println(count);
	}
}
