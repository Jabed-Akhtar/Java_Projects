package lesson1_basics;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.print("Enter a number: ");
		int user_input_number = scan.nextInt();
		System.out.print("The entered value is: ");
		System.out.println(user_input_number);
		*/
		
		System.out.print("Enter a String: ");
		String user_input_string = scan.nextLine();
		System.out.print("The entered string is: ");
		System.out.println(user_input_string);
	}
}
