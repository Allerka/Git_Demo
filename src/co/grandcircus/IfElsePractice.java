package co.grandcircus;

import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// ask the user for a grade
		System.out.println("Enter a grade: ");

		// assign a grade to the number
		int grade = scan.nextInt();

		// check to see if the grade is within a certain range
		while (grade >= 100 || grade <= 0) {
			System.out.println("Invalid entry.");
			grade = scan.nextInt();
		}
		
			// print the grade
			if (grade >= 85) {
				System.out.println("A");
			} else if (grade >= 71) {
				System.out.println("B");
			} else if (grade >= 61) {
				System.out.println("C");
			} else if (grade >= 50) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}  

		// the program should end here
		scan.close();
	}

}
