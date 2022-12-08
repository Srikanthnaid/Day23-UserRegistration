package Day23.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		userRegistration.validFirstName();
		userRegistration.validSecondName();
		userRegistration.validEmailId();
		userRegistration.validPhoneNumber();
		userRegistration.validPassword();
	}

	public void validFirstName() {
		Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter user firstname");
		String firstName = scanner.next();

		Matcher matcher = pattern.matcher(firstName);
		if (matcher.matches()) {
			System.out.println("First name is valid");
		} else {
			System.out.println("First name is Invalid");
		}
	}

	public void validSecondName() {
		Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter user second name");
		String secondName = scanner.next();

		Matcher matcher = pattern.matcher(secondName);
		if (matcher.matches()) {
			System.out.println("Second name is valid");
		} else {
			System.out.println("Second name is Invalid");
		}
	}

	public void validEmailId() {
		Pattern pattern = Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter user Email");
		String email = scanner.next();

		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			System.out.println("Email name is valid");
		} else {
			System.out.println("Email name is Invalid");
		}
	}

	public void validPhoneNumber() {
		Pattern pattern = Pattern.compile("^[9][1]\s[6-9][0-9]{9}$");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter user PhoneNumber");
		String email = scanner.nextLine();

		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			System.out.println("PhoneNumber is valid");
		} else {
			System.out.println("PhoneNumber  is Invalid");
		}
	}

	public void validPassword() {
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9a-zA-Z]).{8,}$");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter user  password");
		String password = scanner.next();

		Matcher matcher = pattern.matcher(password);
		if (matcher.matches()) {
			System.out.println("password is valid");
		} else {
			System.out.println("password  is Invalid");
		}
	}
	

}
