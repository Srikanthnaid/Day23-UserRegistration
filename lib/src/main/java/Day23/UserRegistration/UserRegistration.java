package Day23.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public String validFirstName(String fName) throws UserRegistrationException {
		Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}$");

		Matcher match = pattern.matcher(fName);
		if (match.matches())
			return "Valid";
		else
			throw new UserRegistrationException("Enter Valid first Name");
	}

	public String validSecondName(String sName) throws UserRegistrationException {
		Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}$");

		Matcher match = pattern.matcher(sName);
		if (match.matches())
			return "Valid";
		else
			throw new UserRegistrationException("Enter Valid Second Name");
	}

	public String validEmailId(String email) throws UserRegistrationException {
		Pattern pattern = Pattern.compile("^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$");

		Matcher match = pattern.matcher(email);
		if (match.matches())
			return "Valid";
		else
			throw new UserRegistrationException("Enter Valid Email Id");
	}

	public String validPhoneNumber(String phoneNumber) throws UserRegistrationException {

		boolean matcher = Pattern.matches("^91\s[6-9][0-9]{9}$", phoneNumber);
		if (matcher)
			return "Valid";
		else
			throw new UserRegistrationException("Enter Valid Phone Number");
	}

	public String validPassword(String password) throws UserRegistrationException {
		boolean matcher = Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=])?.{8,}$", password);

		if (matcher)
			return "Valid";
		else
			throw new UserRegistrationException("Enter Valid Password");

	}
}