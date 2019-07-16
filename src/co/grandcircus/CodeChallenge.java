package co.grandcircus;

import java.util.Scanner;

/*
	 * Your goal: Determine what a user should wear based on the 
	 * type of event they're attending and the temperature outside.
	 * 
	 * Options: 
	 * eventType should be used as a condition for eventClothing
	 *  casual = something comfy
	 *  semi-formal = business casual or a polo
	 *  formal = a suit
	 *  
	 * temperature should be used as a condition for tempClothing 
	 *  temperature < 54 = a coat
	 *  temperature > 74 = no jacket
	 *  temperature between 54 and 74 = a jacket
	 *  
	 *  Bonus Challenge: Ask the user if they would like to continue and go again
	 */
public class CodeChallenge {

	public static void main(String[] args) {
		// initial setup
		Scanner scan = new Scanner(System.in);
		String eventType;
		String eventClothing;
		String tempClothing;
		int temp;
		String cont;

		do {
			// user input
			System.out.println("You're going to an event! Let's figure out what to wear.");
			System.out.println("First, is the event casual, semi-formal, or formal?");
			do {
				eventType = scan.nextLine();
				if (eventType.equalsIgnoreCase("casual")) {
					eventClothing = "something comfy";
				} else if (eventType.equalsIgnoreCase("semi-formal")) {
					eventClothing = "business casual or a polo";
				} else if (eventType.equalsIgnoreCase("formal")) {
					eventClothing = "a suit";
				} else {
					eventClothing = "invalid";
					System.out.println("Invalid input. Please try again.");
				}
			} while (eventClothing.equalsIgnoreCase("invalid"));

			System.out.println("OK, it's " + eventType + ". What is the temperature going to be?");
			temp = scan.nextInt();
			System.out.println("Alright, " + temp + " degrees.");
			scan.nextLine();

			if (temp <= 54) {
				tempClothing = "a coat.";
			} else if (temp >= 74) {
				tempClothing = "no jacket.";
			} else {
				tempClothing = "a jacket.";
			}
			System.out.println("You should wear " + eventClothing + " and " + tempClothing);
			System.out.println(" ");
			System.out.println("Would you like to continue?");
			cont = scan.nextLine();
		} while (cont.equalsIgnoreCase("y"));

		scan.close();
	}

}
