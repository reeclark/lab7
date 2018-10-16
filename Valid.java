package lab7;

import java.util.Scanner;
import validator.LabValidator;

public class Valid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$  [A-Z][a-z]{1,15}\\s+[A-Z][a-z]{1,15}
		System.out.println(name(scan, "Enter your name: ", "^[A-Z][a-z]{1,30}$"));

		System.out.println(email(scan, "Please enter a valid email: ", "\\w{5,30}@\\w{5,10}.\\w{2,3}"));

		System.out.println(number(scan, "Please enter a valid phone number in (xxx)-xxx-xxxx format: ",
				"^\\(?(\\d{3})\\)?-\\d{3}-\\d{4}"));

		System.out.println(date(scan, "Enter date in dd/mm/yyyy format: ", "^\\d{2}\\-\\d{2}\\-\\d{4}$"));

	}

	public static String name(Scanner scan, String prompt, String regex) {
		boolean valid = false;
		String input;

		do {
			input = LabValidator.getString(scan, prompt);
			if (input.matches(regex)) {
				System.out.println("Name is valid! ");
				valid = true;
			} else {
				System.out.println("Sorry, name is not valid! ");
				valid = false;
			}
		} while (!valid);
		return input;
	}

	public static String email(Scanner scan, String prompt, String regex) {
		boolean valid = false;
		String input;

		do {
			input = LabValidator.getString(scan, prompt);
			if (input.matches(regex)) {
				System.out.println("Email, is valid! ");
				valid = true;
			} else {
				System.out.println("Sorry, email is not valid! ");
				valid = false;
			}
		} while (!valid);
		return input;
	}

	public static String number(Scanner scan, String prompt, String regex) {
		boolean valid = false;
		String input;

		do {
			input = LabValidator.getString(scan, prompt);
			if (input.matches(regex)) {
				System.out.println("Phone number is valid! ");
				valid = true;
			} else {
				System.out.println("Sorry, Phone is not valid! ");
				valid = false;
			}
		} while (!valid);
		return input;
	}

	public static String date(Scanner scan, String prompt, String regex) {
		boolean valid = false;
		String input;

		do {
			input = LabValidator.getString(scan, prompt);
			if (input.matches(regex)) {
				System.out.println("Date is valid! ");
				valid = true;
			} else {
				System.out.println("Sorry, date is not valid! ");
				valid = false;
			}
		} while (!valid);
		return input;
	}

}
