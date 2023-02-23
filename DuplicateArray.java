package logical;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[] = { "rohit", "deepak", "tejas", "vinay", "rohit", "deepak" };
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					System.out.println(s[i]);

				}
			}
		}
		

	
	}

}
