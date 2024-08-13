package com.game.tetris;

import java.util.*;
public class Tetris{

    static int generateRandomNumber() {
        int num = new Random().nextInt(7);
        return num;
    }
    public static void main(String[] args) {

        char matrix[][] = new char[18][10];

        Function.initialFill(matrix);
        Function.printMatrix(matrix);
        int score=0;
        int prevScore=0;
        while(true)
        {
            String shapes[] = {"S","L","T","SQ","Z","ML","I"};

        //    System.out.println("Enter Shape Input : (S,L,T,SQ,Z,ML,I) : ");
        //    Scanner ip = new Scanner(System.in);
            //String ch = shapes[generateRandomNumber()];
            String ch = shapes[6];

            char[][] shapeMatrix = Shape.getShape(ch);

            PlayTheGame play = new PlayTheGame(shapeMatrix,matrix);
            if(play.isGameEnd())
            {
                System.out.println("GAME OVER !!\n"+"Achieved Score is : "+score);
                break;
            }
            play.start();
            do{
            	System.out.println("score "+prevScore+" "+score);
                prevScore = score;
                score += Function.calculateScore(matrix,score);
            }while(prevScore!=score);  // just if the grid has 3row score then eliminates all three..
            System.out.println("Current Score : "+score);
            Function.printMatrix(matrix);
        }
    }
}
