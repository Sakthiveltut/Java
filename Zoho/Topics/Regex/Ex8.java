import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex8{
	public static void main(String[] args) {
		//String str = "Phone numbers: 123-456-7890, 987-654-3210";
		//String str = "Visit example.com or http://www.example.com for more information.";
		
		//Pattern p =Pattern.compile("\\p{Space}");
		//Pattern p =Pattern.compile("(?<name>\\d{3})-(\\d{3})-(\\d{4})");
		//Pattern p =Pattern.compile("(?:https?://)?(www\\.)?example\\.com");
		//Pattern p =Pattern.compile("(?i)example");
		
		
		//Pattern pattern = Pattern.compile("(?i)example");
        
        //Pattern pattern = Pattern.compile("(?i:(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec))");
        
        //Pattern pattern = Pattern.compile("\\b\\w+(?=\\.com)");
        
        //Pattern pattern = Pattern.compile("(?<=\\bMr\\.)\\s\\w+");
        
        //Pattern pattern = Pattern.compile("(?<!\\bMr\\.)\\s\\w+");
        Pattern pattern = Pattern.compile("(?>\\d+)(?>\\.\\d+)?");
	String text = "123 456.789 10.0 0.001 100";


	//String text = "Mr. Smith and Dr. Johnson are colleagues.";


		//String text = "Mr. Smith and Mr. Johnson are Dr. Moseshcolleagues.";

        //String text = "Visit exemple exAmple Example.com or example.org for examPle more information.";
        
        //String text = "The months are Jan, FEB, mar, APR, may, jUn, JUL, aug, Sep, oct, nov, and DEC.";
		
		Matcher m=p.matcher(str);
		while(m.find()){
			System.out.println(m.group()+" "+m.start());
		}
	}
}
