package Day23.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		//call the interface methods;
		Function function = (FirstName) -> {//lambda expression
			if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", FirstName)) {
				System.out.println("Valid");
			} else {
				System.out.println("! Not-Valid");
			}
		};
		function.check("Srikanth");//Pass the argument firstname
	}

}
