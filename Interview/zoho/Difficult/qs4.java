package Interview.zoho.Difficult;

import java.util.Scanner;

//3 3 3 w n
//p1=6, p2=3, extra=2 total=11

public class qs4 {
  static boolean player1 = true, player2 = false;

  public static void main(String[] args) {
    int p1 = 0, p2 = 0, extra = 0, w = 1, n = 1;

    Scanner sc = new Scanner(System.in);

    String userString = sc.nextLine();
    char userChar[] = userString.toCharArray();

    for (int i = 0; i < userChar.length; i++) {
      System.out.println(userChar[i]);
      if(userChar[i] == 'w' || userChar[i] == 'n'){
        extra+=1;
      }else {
        if (player1) {
          p1 += Character.getNumericValue(userChar[i]);
        } else if (player2) {
          p2 += Character.getNumericValue(userChar[i]);
        }
        strikeChange(userChar[i]);
      }
    }
    System.out.println("player1 " + p1);
    System.out.println("player2 " + p2);
    System.out.println("extra " + extra);
    System.out.println("total score " + (p1 + p2 + extra));
  }

  static void strikeChange(char c) {
    if (c == '1' || c == '3' || c == '5') {
        if(player1){
          player1 = !player1;
          player2 = !player2;
        }else if(player2){
          player1 = !player1;
          player2 = !player2;
        }
    }
  }
}
