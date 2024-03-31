import java.util.*;
import java.util.stream.Stream;

public class Main{


	public static void main(String[] args){
		
		String sentence = "Welcome to java programming";
		//String sentence = "aa bb cc";
		String name1 = "mosmeshm", name2 = "boaesh", name3 = "aobthi", name4 = "mosesh paul raj";
		char[] name = {'s','a','k','t','h','i'};
		char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};

		String text = "This is the first line.\nThis is the second line.\nAnd this is the third line.";


		String s1 = new String("hello");
       		String s2 = "hello";
        	String s3 = s1.intern();
		//String s4 = s2.intern();
		
		System.out.println("charAt() "+sentence.charAt(0));
		
		//System.out.println("codePointAt() "+sentence.codePointAt(12));
		System.out.println("codePointBefore() "+sentence.codePointBefore(2));
		System.out.println("compareTo() "+name1.compareTo(name4));
		System.out.println("compareToIgnoreCase() "+name2.compareToIgnoreCase(name3));
		System.out.println("concat() "+name2.concat(name3));
		System.out.println("contains() "+sentence.contains("java"));
		System.out.println("contentEquals() "+name1.contentEquals("mosesh"));
		System.out.println("contentEquals() "+name1.contentEquals(new StringBuffer("mosesh")));
		System.out.println("copyValueOf() "+String.copyValueOf(name));
		System.out.println("copyValueOf() "+String.copyValueOf(charArray,6,5));
		System.out.println("endsWith() "+sentence.endsWith("g"));
		System.out.println("format() "+ String.format("Name: %s, Age: %d, GPA: %.2f", "John", 25, 3.75));
		System.out.println("formatted() "+"Name: %s, Age: %d, GPA: %.2f".formatted("John", 25, 3.75));
		System.out.println("hashCode() "+name1.hashCode());
		System.out.println("indent() "+sentence.indent(10));
		System.out.println("indexOf() "+name1.indexOf("h"));
		System.out.println("indexOf() "+name1.indexOf("m", 2));
		System.out.println("indexOf() "+name1.indexOf("m", 4,8));
		System.out.println("intern() "+s3);

		String s10 = " ";
		System.out.println("isBlank() "+s10.isBlank());
		System.out.println("isEmpty() "+s10.isEmpty());
		
		String name6[] = {"sa","kt","hi"};
		System.out.println("join() "+String.join("", name6));
		System.out.println("join() "+String.join(",", name6));

		List<String> list = Arrays.asList("sakthi", "rahul", "mosesh");
		System.out.println("join() "+String.join("-", list));
		
		System.out.println("lastIndexOf() "+sentence.lastIndexOf("a"));
		System.out.println("lastIndexOf() "+sentence.lastIndexOf("a", 13));

		Stream<String> linesStream = text.lines();
	        linesStream.forEach(System.out::println);
		
		System.out.println("repeat() "+name4.repeat(4)); 
        	
		System.out.println("replace() "+name4.replace("mosesh", "")); 
        	System.out.println("replace() "+name4.replace('u', ' ')); 
		System.out.println("replaceALl() "+name4.replaceAll("a", "z")); 
		System.out.println("replaceFirst() "+text.replaceFirst("line", "l")); 
			
		String str = "apple,banana,orange,mango,pineapple";
		for(String s:str.split(",")){
			System.out.println(s); 
		}     	
		System.out.println("-------------------"); 
        	for(String s:str.split(",",3)){
			System.out.println(s); 
		}    

		System.out.println("startWith() "+text.startsWith("This"));
		
		String temp2 = "sakthi\nsakthi";
		System.out.println("length() "+temp2.length());
		System.out.println("startWith() "+temp2.startsWith("s",7));

		temp2 = " s a K t H i ";
		String str2 = "  Hello, \u2005World!\t  ";
		System.out.println("length() "+str2.length());
		System.out.println("strip() "+str2.strip().length());
		System.out.println("trim() "+str2.trim().length());
		System.out.println("stripLeading() "+temp2.stripLeading().length());//front space remove
		System.out.println("stripTrailing() "+temp2.stripTrailing().length());//end space remove


		        String multilineString = """				
3
1					""";
		CharSequence temp = temp2.subSequence(5,12);
		System.out.println("subSequence() "+temp );
		
	System.out.println("toUpperCase() "+temp2.toUpperCase());
	System.out.println("toLowerCase() "+temp2.toLowerCase());

		
		

        System.out.println("Original length: " + multilineString.length());
        System.out.println("Length after stripIndent(): " + multilineString.stripIndent().length());
    

		System.out.println("\ncodePoints() "+sentence.codePoints());
		System.out.println("chars() "+sentence.chars());	
		System.out.println("codePointCount() "+sentence.codePointCount(0,5));		
	}
}