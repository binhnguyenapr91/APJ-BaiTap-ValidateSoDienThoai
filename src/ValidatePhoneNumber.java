import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
	private static Pattern pattern;
	private Matcher matcher;
	private static final String PHONE_REGEX = "^\\(\\d{2}\\)\\s*-\\s*\\(0\\d{9}\\)";

	public ValidatePhoneNumber() {
		pattern = Pattern.compile(PHONE_REGEX);
	}

	public boolean validate(String s) {
		matcher = pattern.matcher(s);
		return matcher.matches();
	}
}
