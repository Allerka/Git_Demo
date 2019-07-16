package co.grandcircus;

import java.util.Scanner;

public class GitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world.");
		
		int age = 34;
		
		System.out.println(age);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = scan.nextLine();
		System.out.println("Hello " + name);
		
		scan.close();
	}

}
