package Day23.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface IUserRegistration {
	String validate(String field) throws UserRegistrationException;
}

public class UserRegistration {

	IUserRegistration validFirstName = (fName) -> {
		boolean matches = Pattern.matches("^[A-Z]+[a-zA-Z]{2,}$", fName);
		if (matches)
			return "Valid";
		else
			throw new UserRegistrationException("Enter Valid first Name");
	};

	IUserRegistration validSecondName = (sName) -> {
		boolean matches = Pattern.matches("^[A-Z]+[a-zA-Z]{2,}$", sName);
		if (matches)
			return "Valid";
		else
			throw new UserRegistrationException("Enter Valid Second Name");
	};

	IUserRegistration validEmailId = (email) -> {
		boolean matches = Pattern.matches("^\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{2,3})+$", email);
		if (matches)
			return "Valid";
		else
			throw new UserRegistrationException("Enter Valid Email Id");
	};
	IUserRegistration validPhoneNumber = (phoneNumber) -> {
		boolean matches = Pattern.matches("^91\s[6-9][0-9]{9}$", phoneNumber);
		if (matches)
			return "Valid";
		else
			throw new UserRegistrationException("Enter Valid Phone Number");
	};

	IUserRegistration validPassword = (password) -> {
		boolean matches = Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=])?.{8,}$", password);
		if (matches)
			return "Valid";
		else
			throw new UserRegistrationException("Enter Valid Password");
	};
}