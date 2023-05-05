

package Arithmetic;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fifthMethod();
		threeMethod();
		twoMethod();
		onemethod();

	}

	//1+2+3+4+..N
	public static void onemethod() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an 'n' value");
		int n = sc.nextInt();
		for (int i = 1, a = 1; i <= n; i++, a++) {
			sum = sum + a;
		}
		System.out.println("sum :" + sum);
	}

	// 9+13+17+...n
	public static void twoMethod() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an 'n' value");
		int n = sc.nextInt();
		for (int i = 1, a = 9; i <= n; i++, a += 4) {
			sum = sum + a;
		}
		System.out.println("sum :" + sum);

	}

	// 2+4+6+8...n
	public static void threeMethod() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an 'n' value");
		int n = sc.nextInt();
		for (int i = 1, a = 2; i <= n; i++, a += 2) {
			sum = sum + a;
		}
		System.out.println("sum :" + sum);
	}

	// 1+3+5+7+...n
	public static void fourMethod() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an 'n' value");
		int n = sc.nextInt();
		for (int i = 1, a = 1; i <= n; i++, a += 2) {
			sum = sum + a;
		}
		System.out.println("sum :" + sum);

	}
	
	//10+9+8+...1
	public static void fifthMethod() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an 'n' value");
		int n = sc.nextInt();
		for (int i = 1, a = 10; i <= n; i++, a -= 1) {
			sum = sum + a;
		}
		System.out.println("sum :" + sum);

	}
	
	
	
}
