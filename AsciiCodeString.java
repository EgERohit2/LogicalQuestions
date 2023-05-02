//print ASCII code of the string

package StringProgramms;

public class AsciiCodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ITS SIMPLE";
		
		for(int i=0;i<s.length();i++) {
			char c= s.charAt(i);
			System.out.println(c+" "+(int)c);
		}
	}

}
