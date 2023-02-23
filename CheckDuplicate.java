package logical;

public class CheckDuplicate {

	public static Boolean check(String s[]) {

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {

		String s[] = { "rohit", "deepak", "tejas", "vinay", "rohit", "deepak" };
		if (check(s)) {
			System.out.println("Duplicate values are present");
		} else {
			System.out.println("Duplicate values are not present");
		}
	}
}
