package Interview.zoho.Difficult;
import java.util.Scanner;

//i like hoho
//i like zoho

public class qs1 {

  public static void main(String[] args) {                       
    Scanner sc = new Scanner(System.in);                         
    String userSen = sc.nextLine();       
    String wordsList[] = {
      "sun",
      "day",
      "morning",
      "Zoho",
      "Beautiful",
      "everybody",
    };

    String sWords[] = userSen.split("\\s+");
    int verifiedLetter = 0;

    for (int i = 0; i <= sWords.length - 1; i++) {
      for (int j = 0; j <= wordsList.length - 1; j++) {
        if (!sWords[i].equals(wordsList[j])) {
          if (sWords[i].length() == wordsList[j].length()) {
            char[] userLetters = sWords[i].toCharArray();
            char[] wordLetters = wordsList[j].toCharArray();
            for (int k = 0; k <= userLetters.length - 1; k++) {
              if (userLetters[k] == wordLetters[k]) {
                verifiedLetter += 1;
              }
            }
            System.out.println(verifiedLetter + " " + userLetters.length);
            int chance = ((verifiedLetter * 100) / userLetters.length);
            if (chance >= 50) {
              System.out.println(sWords + "" + sWords[i]);
              int wordPosition = findPosition(sWords, sWords[i]);
              System.out.println(wordPosition);
              sWords[wordPosition] = wordsList[j];
              break;
            }
          }
        }
        verifiedLetter = 0;
      }
    }
    for (String sword : sWords) {
      System.out.println(sword);
    }
  }

  //give value to return position of array
  static int findPosition(String[] arr, String value) {
    for (int i = 0; i < arr.length; i++) {
      if (value.equals(arr[i])) {
        return i;
      }
    }
    return -1;
  }
}
