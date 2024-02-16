package Difficult;

import java.util.Scanner;

public class task2 {
    
    public static void main(String[] args){
        String wordsList[] = {
            "sun",
            "day",
            "morning",
            "Zoho",
            "Beautiful",
            "everybody",
            "like"
          };    

        Scanner sc = new Scanner(System.in);
        String userSen = sc.nextLine();

        char userChar[] = userSen.toCharArray();
        for(int i=0;i<userChar.length;i++){
            for(int j=0;j<wordsList.length;j++){
                char wordsChar[] = wordsList[j].toCharArray();
                if(userChar[i].equals(wordsChar[j])){
                    
                    
                }
            }
        }
    }
}
