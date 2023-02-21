//WAP to find the given string is Palindrome or not

package logical;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Level";
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev +s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		System.out.println(rev);
	}

	}


