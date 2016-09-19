import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches
{
	public static void main( String [] args){
		
		String line = "This order was placed for QT3000! This was for HH5999! ";
		String pattern ="(\\d+)";

		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(line);

		while (m.find()) {
			for (int i = 0; i <= m.groupCount(); i++){
				System.out.printf("group[%d] is: %s \n", i, m.group(i));

			} 
		}  
	}
}
