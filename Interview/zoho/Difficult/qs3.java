package Interview.zoho.Difficult;

import java.util.ArrayList;
import java.util.Scanner;

//sakthi@gmail.com
//moclia@mgiht.kas

public class qs3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String rev = sc.nextLine();

    ArrayList<Object> symbol =new ArrayList<Object>();

    String symbolsRemoved = rev.replaceAll("[^a-zA-Z0-9]", "");
    char userChar[] = symbolsRemoved.toCharArray();
    System.out.println(symbolsRemoved);

    char revChar[] = rev.toCharArray();
    int index = 0;
    for (int i = userChar.length-1; i>=0 ; i--) {
            symbol.add(index,userChar[i]);
            ++index;
    }
    // System.out.println(symbol);

    for (int i = 0; i < revChar.length; i++) {
        if(isSymbol(revChar[i])){
            symbol.add(i,revChar[i]);
        }
    }
    for (int i = 0; i < revChar.length; i++) {
      System.out.print(symbol.get(i));
    }
  }

  static boolean isSymbol(char c) {
    return !Character.isLetterOrDigit(c);
  }
}
