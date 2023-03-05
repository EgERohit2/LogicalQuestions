package Practise;

import java.util.Scanner;

public class Vertical {

	String str;

	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		str = sc.nextLine();

	}

	void print() {

		str = str.toUpperCase();
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vertical v = new Vertical();
		v.accept();
		v.print();
	}

}
