package lab7;

import java.util.Scanner;

import validator.LabValidator;

public class Valid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		 System.out.println(name(scan, "Enter your name: ", ""));

		// System.out.println(LabValidator.myRegex(scan, "Enter your name: ",
		// "\\d{30}"));

//		System.out.println(number(scan, "Enter your number in {xxx}-{xxx}-{xxxx} format: ",
//				"^\\{?(\\d{3})\\}?-\\{?(\\d{3})\\}?-\\{?(\\d{4})\\}?"));

		// System.out.println(LabValidator.myRegex(scan, "Enter date in (dd/mm/yyyy)
		// format: ", "\\d{2}-\\d{2}-\\d{4}$"));

	}

	public static String name(Scanner scan, String prompt, String regex) {
		boolean valid = false;
		String input;

		do {
			input = LabValidator.getString(scan, prompt);
			if (input.matches(regex)) {
				valid = true;
			} else {
				System.out.println("Sorry, name is not valid! ");
				valid = false;
			}
		} while (!valid);
		return input;
	}

//	public static String number(Scanner scan, String prompt, String regex) {
//		boolean valid = false;
//		String input;
//
//		do {
//			input = LabValidator.getString(scan, prompt);
//			if (input.matches(regex)) {
//				valid = true;
//			} else {
//				System.out.println("Sorry, Phone is not valid! ");
//				valid = false;
//			}
//		} while (!valid);
//		return input;
//	}

}
