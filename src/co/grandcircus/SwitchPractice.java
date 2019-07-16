package co.grandcircus;

import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a lucky number: ");
		int lucky = scan.nextInt();

		// an alternative to if/else but not useful in a range
		switch (lucky) {
		case 7:
		case 57:
			System.out.println("Lucky number 7");
			break;
		case 21:
			System.out.println("21 is okay");
			break;
		case 23:
			System.out.println("It must be your birthday!");
			break;
		default:
			System.out.println("You're not lucky at all...");
		}

		scan.close();

	}

}
