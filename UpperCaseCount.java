package StringProgramms;

public class UpperCaseCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="Its sImPle";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c= s.charAt(i);
			if(Character.isUpperCase(c)) {
				count++;
				
			}
			System.out.println(count+ "upper");
		}
	}

}
