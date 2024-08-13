package com.game.tetris;

public class Shape {

    static char s[][]={{' ','*','*'},{'*','*',' '}};
    static char l[][] = {{'*',' '},{'*',' '},{'*','*'}};
    static char t[][] = {{'*','*','*'},{' ','*',' '},{' ','*',' '}};
    static char sq[][] = {{'*','*'},{'*','*'}};
    static char z[][]={{'*','*',' '},{' ','*','*'}};
    static char ml[][] = {{' ','*'},{' ','*'},{'*','*'}};
    static char i[][] = {{'*'},{'*'},{'*'}};

    static char[][] getShape(String ch)
    {
        switch(ch)
        {
            case "S":return s;
            case "L":return l;
            case "T":return t;
            case "SQ":return sq;
            case "Z":return z;
            case "ML":return ml;
            case "I":return i;
        }
        return null;
    }
}
