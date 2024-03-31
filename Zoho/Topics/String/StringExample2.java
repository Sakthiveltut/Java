public class StringToParagraph {
    public static void main(String[] args) {

        String inputString = "This is a sample string that you want to convert into a paragraph.";

        System.out.println(convertToParagraph(inputString));
    }

    private static String convertToParagraph(String inputString) {
        String[] sentences = inputString.split(" ");
	for(String sentence : sentences){

		System.out.println(sentence);
	}
        String paragraph = String.join(" ", sentences);

        return paragraph;
    }
}
