//WAP to check year is leap year or not

package logical;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();
	        
	        boolean isLeapYear = false;
	        
	        if (year % 4 == 0) {
	            if (year % 100 == 0) {
	                if (year % 400 == 0) {
	                    isLeapYear = true;
	                }
	            } else {
	                isLeapYear = false;
	            }
	        }
	        
	        if (isLeapYear==true) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	        
	        scanner.close();
	    }
	}

