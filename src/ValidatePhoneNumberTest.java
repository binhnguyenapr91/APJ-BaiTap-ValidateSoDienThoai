public class ValidatePhoneNumberTest {
	private static ValidatePhoneNumber validatePhoneNumber;
	public static final String[] validPhoneNumber = { "(84)-(0978489648)" };
	public static final String[] invalidPhoneNumber = { "(a8)-(22222222)" };

	public static void main(String[] args) {

		validatePhoneNumber = new ValidatePhoneNumber();
		for (String phoneNumber : validPhoneNumber) {
			boolean isvalid = validatePhoneNumber.validate(phoneNumber);
			System.out.println("Email is " + phoneNumber + " is valid: " + isvalid);
		}
		for (String phoneNumber : invalidPhoneNumber) {
			boolean isvalid = validatePhoneNumber.validate(phoneNumber);
			System.out.println("Email is " + phoneNumber + " is valid: " + isvalid);
		}

	}

}
