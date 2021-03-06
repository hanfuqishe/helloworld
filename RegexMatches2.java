import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches2
{
	private static final String REGEX = "\\bcat\\b";
	private static final String INPUT = "cat cat cat cattie cat";

	public static void main (String [] args)
	{
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT);

		for (int i=0; m.find(); i++){
			System.out.println("Match number " + i);
			System.out.println("start(): " + m.start());
			System.out.println("end(): " + m.end());
		}
	}
}
