package Day23.UserRegistration;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	static UserRegistration user;

	@BeforeAll
	public static void initiate() {
		user = new UserRegistration();
	}

	@Test
	public void givenTextWhenItContainsFirstCapsInFnameAndMinThreeAlphabetsShouldReturnTrue() {

		String actual = user.validFirstName("Srikanth");
		String expected = "Valid";
		Assertions.assertSame(actual, expected);
	}

	@Test
	public void givenTextWhenItDoesNotContainsFirstCapsInFnameShouldReturnTrue() {
		String actual = user.validFirstName("srikanth");
		String expected = "InValid";
		Assertions.assertSame(actual, expected);
	}

	@Test
	public void givenTextWhenItContainsFirstCapsInFnameButNotMinThreeCharShouldReturnTrue() {
		String actualResult = user.validFirstName("Na");
		String expectedResult = "InValid";
		Assertions.assertSame(actualResult, expectedResult);
	}

	@Test
	public void givenTextWhenItDoesNotContainsFirstCapsInlnameShouldReturnTrue() {
		String actualResult = user.validFirstName("naidu");
		String expectedRes = "InValid";
		Assertions.assertSame(actualResult, expectedRes);
	}

	@Test
	public void givenTextWhenItContainsFirstCapsInlnameButNotMinThreeCharShouldReturnTrue() {
		String actualResult = user.validSecondName("sr");
		String expectedRes = "InValid";
		Assertions.assertSame(actualResult, expectedRes);
	}

	@Test
	public void givenTextWhenItContainsFirstCapsInSnameShouldReturnTrue() {
		String actual = user.validFirstName("Srikanth");
		String expected = "Valid";
		Assertions.assertSame(actual, expected);
	}

	@Test
	public void givenEmailWhenDoesNotContainsAtTheRateShouldReturnFalse() {

		String actualResult = user.validEmailId("kuabc.yahoo.com");
		String expectedRes = "InValid";
		Assertions.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenDoesNotContainsabcShouldReturnFalse() {

		String actualResult = user.validEmailId("xyz.yahoo.co.in");
		String expectedRes = "InValid";
		Assertions.assertSame(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenItContainsMoreThanThreeCharAtLastShouldReturnFalse() {

		String actualResult = user.validEmailId("xyz.yahoo.co.india");
		String expectedRes = "InValid";
		Assertions.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenItContainsMoreThanTwoTLDShouldReturnFalse() {

		String actualResult = user.validEmailId("xyz.yahoo.co.in.co");
		String expectedRes = "InValid";
		Assertions.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenItContainsOneCharInTLDShouldReturnFalse() {

		String actualResult = user.validEmailId("xyz.yahoo.co.i");
		String expectedRes = "InValid";
		Assertions.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenItContainsDoubleDotsShouldReturnFalse() {

		String actualResult = user.validEmailId("xyz..yahoo.co.i");
		String expectedRes = "InValid";
		Assertions.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenItContainsSpecialCharacterShouldReturnFalse() {
		String actualResult = user.validEmailId("xyz.yahoo.c@.i");
		String expectedRes = "InValid";
		Assertions.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenItContainsDigitsInTLDShouldReturnFalse() {

		String actualResult = user.validEmailId("xyz.yahoo.c1.i");
		String expectedRes = "InValid";
		Assertions.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenAccordingToProperReqShouldReturnTrue() {
		String actualResult = user.validEmailId("abc.xyz@bl.co.in");
		String expectedRes = "Valid";
		Assertions.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenMobileNumberWithSpaceAndProperNumberShouldReturnTrue() {
		String actualResult = user.validPhoneNumber("91 6301663090");
		String expectedRes = "Valid";
		Assertions.assertSame(actualResult, expectedRes);
	}

	@Test
	public void givenMobileNumberWithoutSpaceAndProperNumberShouldReturnFalse() {

		String actualResult = user.validPhoneNumber("916301663090");
		String expectedRes = "InValid";
		Assertions.assertSame(actualResult, expectedRes);
	}

	@Test
	public void givenMobileNumberWithSpaceButNotProperCountryCodeShouldReturnFalse() {

		String actualResult = user.validPhoneNumber("349640604452");
		String expectedRes = "InValid";
		Assertions.assertSame(actualResult, expectedRes);
	}

	@Test
	public void givenPasswordWithoutAnUpperCaseShouldReturnFalse() {

		String actualResult = user.validPassword("abccc@123");
		String expectedRes = "InValid";
		Assertions.assertSame(actualResult, expectedRes);
	}

	@Test
	public void givenPasswordWithoutASpecialCharShouldReturnFalse() {

		String actualResult = user.validPassword("abcde123");
		String expectedRes = "InValid";
		Assertions.assertSame(actualResult, expectedRes);
	}

	@Test
	public void givenPasswordWithoutALowerCaseShouldReturnFalse() {

		String actualResult = user.validPassword("ABCDE@123");
		String expectedRes = "InValid";
		Assertions.assertSame(actualResult, expectedRes);
	}

	@Test
	public void givenPasswordWithoutMinNumOfCharShouldReturnFalse() {

		String actualResult = user.validPassword("Ac@123");
		String expectedRes = "InValid";
		Assertions.assertSame(actualResult, expectedRes);
	}

	@Test
	public void givenPasswordWithProperRequirementsShouldReturnTrue() {

		String actualResult = user.validPassword("Abccc@123");
		String expectedRes = "Valid";
		Assertions.assertEquals(actualResult, expectedRes);
	}

}
