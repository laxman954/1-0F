
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SampleRegex {

	public static void main(String[] args) {
		final Pattern pattern = Pattern.compile("[^a-zA-Z]{3,}");
		final Matcher matcher = pattern.matcher("34");
		System.out.println(matcher.matches());
	}

}
