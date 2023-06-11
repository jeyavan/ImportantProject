package RegularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		String sentence="A regular expression is a pattern that the regular expression engine attempts to match in input text";
		Pattern p=Pattern.compile("expression");
		Matcher m=p.matcher(sentence);
		while(m.find()) {
			System.out.println(m.group()); 
			
			System.out.println(m.end());
		}
		
	   Pattern pattern = Pattern.compile("Nivedita", Pattern.CASE_INSENSITIVE  );
	    Matcher matcher = pattern.matcher("nivedita");
	    boolean matchFound = matcher.find();
	    Pattern pattern1 = Pattern.compile("^Nivedita",Pattern.UNICODE_CASE   );
	    Matcher matcher1 = pattern1.matcher("nivedita!");
	    boolean matchFound1 = matcher1.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }

		if(matchFound1) {
			
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	   
	}

}
