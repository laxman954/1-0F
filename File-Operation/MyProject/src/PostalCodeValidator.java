import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author lekshmana.murugan
 * @since 09-12-2014
 * This PostalCodeValidator class to validate UK postal code format only
 */
public class PostalCodeValidator {

	public static final String UK_POSTAL_CODE_REGEX ="[a-z0-9]{2,4} [a-z0-9]{3}";
			//"^([A-PR-UWYZ](([0-9](([0-9]|[A-HJKSTUW])?)?)|([A-HK-Y][0-9]([0-9]|[ABEHMNPRVWXY])?)) [0-9][ABD-HJLNP-UW-Z]{2})|GIR 0AA$";
	
	public static boolean ukPostalCodeValidation(String testPincode) throws IOException {
			final Pattern pattern = Pattern.compile(UK_POSTAL_CODE_REGEX);
			final Matcher matcher = pattern.matcher(testPincode.toLowerCase());
			boolean status=matcher.matches();
			return status;		
	}

}
