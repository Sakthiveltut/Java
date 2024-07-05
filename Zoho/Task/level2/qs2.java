package Interview.zoho.Difficult;

import java.util.Scanner;

//ilikezoho
//i like zoho

public class qs2 {
    public static void main(String[] args) {
        String wordsList[] = {
            "sun", "day", "morning", "zoho", "beautiful", "everybody",
            "like", "i", "apple",  "ball", 
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence without spaces: ");
        String userInput = scanner.nextLine();
        String output = addSpacesDynamically(userInput, wordsList);
        System.out.println("Input: " + userInput);
        System.out.println("Output: " + output);
        scanner.close();
    }

    private static String addSpacesDynamically(String input, String[] wordsList) {
        StringBuilder result = new StringBuilder();
        int currentIndex = 0;

        while (currentIndex < input.length()) {
            boolean found = false;

            for (String word : wordsList) {
                if (input.startsWith(word, currentIndex)) {
                    result.append(word).append(" ");
                    currentIndex += word.length();
                    found = true;
                    break;
                }
            }

            if (!found) {
                result.append(input.charAt(currentIndex));
                System.out.println(result);
                currentIndex++;
            }
        }

        return result.toString().trim();
    }
}
