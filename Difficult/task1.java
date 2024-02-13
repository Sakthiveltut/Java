package Difficult;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {

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
    String wordsList1[] = wordsList;

    String sWords[] = userSen.split("\\s+");
    String sWords1[] = sWords;

    int verifiedLetter = 0;

    for (int i = 0; i <= sWords.length - 1; i++) {
      for (int j = 0; j <= wordsList.length - 1; j++) {
        if (!sWords[i].equals(wordsList[j])) {
          if (sWords[i].length() == wordsList[j].length()) {
            char[] userLetters = sWords[i].toCharArray();
            char[] wordLetters = wordsList[j].toCharArray();
            for (char letter : userLetters) {
              System.out.println("before " + letter);
            }
            for (char letter : wordLetters) {
              System.out.println("after " + letter);
            }
            for (int k = 0; k <= userLetters.length - 1; k++) {
              if (userLetters[k] == wordLetters[k]) {
                System.out.println(userLetters[k] + "" + wordLetters[k]);
                verifiedLetter += 1;
                System.out.println("verifiedLetter" + verifiedLetter);
              }
            }
            System.out.println(verifiedLetter + " " + userLetters.length);
            int chance = ((verifiedLetter * 100) / userLetters.length);
            System.out.println("chance:" + chance);
            if (chance >= 50) {
              System.out.println(sWords1 + "" + sWords1[i]);
              int wordPosition = findPosition(sWords1, sWords1[i]);
              System.out.println(wordPosition);
              sWords1[wordPosition] = wordsList1[j];
              break;
            }
          }
        }
        verifiedLetter = 0;
      }
    }
    for (String sword : sWords1) {
      System.out.println(sword);
    }
  }

  static int findPosition(String[] arr, String value) {
    for (int i = 0; i < arr.length; i++) {
      if (value.equals(arr[i])) {
        return i;
      }
    }
    return -1;
  }
}
