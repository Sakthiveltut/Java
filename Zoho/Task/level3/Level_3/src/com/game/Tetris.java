package com.game;

import java.util.Random;
import java.util.Scanner;

public class Tetris {
    
	private static char[][] grid = new char[18][10], currentShape;
	private static byte startRowPos, startColPos;
	
	public static void main(String[] args) {
		intializeGrid();
		int score = 0, previousScore=0;
		while(true) {
			startRowPos = 1;
			startColPos = (byte) ((grid[0].length/2)-1);
			//currentShape = getRandomShape();
			currentShape = new char[][]{{'*'}, {'*'}, {'*'}};
	
			if(isGameEnd()) {
				System.out.println("Game over."+"Achieved score is "+score);
				break;
			}
			
			shapeLoadOnGrid();
			printGrid();
			
			start();
			do {
				previousScore = score;
				score+=calculateScore();
			}while(score!=previousScore);
		}
	}
	
	private static int calculateScore() {
		int score = 0;
		boolean removeRow = true; 
		for(int row=grid.length-2;row>1;row--) {
			
			for(int col=1;col<grid[0].length-1;col++) {
				if(grid[row][col]!='*') {
					removeRow = false;
					break;
				}
			}
			
			if(removeRow) {
				score = 100;
				for(int selectedRow=row;selectedRow>1;selectedRow--) {
					for(int col=1;col<grid[0].length-1;col++) {
						grid[selectedRow][col] = grid[selectedRow-1][col];
					}
				}
			}
		}
		return score;
	}

	private static void start() {
		while(isValidDownMove()) {
			System.out.println("Q-rotate Left\nE-rotate right\nA-Move Left\nS-Move Down\nD-Move Right");
			Scanner scanner = new Scanner(System.in);
			char input = scanner.next().charAt(0);
			clearShape();
			
			if(input=='Q' || input=='q') 	rotateLeft();
			else if(input=='E' || input=='e') rotateRight();
			else if(input=='A' || input=='a') {
				if(!(startColPos-1>0)) 
					System.out.println("Invalid move.");
				else
					startColPos--;
			}
			else if(input=='S' || input=='s') startRowPos++;
			else if(input=='D' || input=='d') {
				if(startColPos+currentShape[0].length+1>=grid[0].length) 
					System.out.println("Invalid move.");
				else
					startColPos++;
			}
			shapeLoadOnGrid();
			printGrid();
		}
	}

	private static boolean isGameEnd() {
		for(int i=0;i<currentShape.length;i++) {
			for(int j=0;j<currentShape[0].length;j++) {
				if(currentShape[i][j]=='*' && grid[i+startRowPos][j+startColPos]=='*') {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean isValidDownMove() {
		int shapeLength = currentShape.length-1;
		for(int col=0;col<currentShape[0].length;col++) {
			if(currentShape[shapeLength][col]=='*' && grid[startRowPos+shapeLength+1][col+startColPos]=='*') {
				return false;
			}
		}
		return true;
	}

	private static void clearShape() {
		for(int i=0;i<currentShape.length;i++) {
			for(int j=0;j<currentShape[0].length;j++) {
				if(currentShape[i][j]=='*') {
					grid[i+startRowPos][j+startColPos]=' ';
				}
			}
		}
	}

	private static void rotateLeft() {
		char[][] rotated = new char[currentShape[0].length][currentShape.length];
		
		for(int col=currentShape[0].length-1;col>=0;col--) {
			for(int row=0;row<currentShape.length;row++) {
				rotated[currentShape[0].length-1-col][row] = currentShape[row][col];
			}
		}
		currentShape = rotated;
	}
	
	private static void rotateRight() {
		char[][] rotated = new char[currentShape[0].length][currentShape.length];
		
		for(int row=currentShape.length-1;row>=0;row--) {
			for(int col=0;col<currentShape[0].length;col++) {
				rotated[col][currentShape.length-1-row] = currentShape[row][col];
			}
		}
		currentShape = rotated;
	}

	private static void shapeLoadOnGrid() {
		for(int i=0;i<currentShape.length;i++) {
			for(int j=0;j<currentShape[0].length;j++) {
				if(currentShape[i][j]!=' ') {
					grid[startRowPos+i][startColPos+j] = currentShape[i][j]; 					
				}
			}
		}
	}

	private static void printGrid() {
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void intializeGrid() {
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(i==0 || j==0 || i==grid.length-1 || j==grid[0].length-1) {
					grid[i][j]='*';
				}
			}
		}
	}
	
    private static char[][] getRandomShape() {
        Random random = new Random();
        int shapeIndex = random.nextInt(7); 
        
        switch (shapeIndex) {
            case 0:
                return new char[][]{{' ', '*', '*'}, {'*', '*', ' '}}; // s
            case 1:
                return new char[][]{{'*', ' '}, {'*', ' '}, {'*', '*'}}; // l
            case 2:
                return new char[][]{{'*', '*', '*'}, {' ', '*', ' '}, {' ', '*', ' '}}; // t
            case 3:
                return new char[][]{{'*', '*'}, {'*', '*'}}; // sq
            case 4:
                return new char[][]{{'*', '*', ' '}, {' ', '*', '*'}}; // z
            case 5:
                return new char[][]{{' ', '*'}, {' ', '*'}, {'*', '*'}}; // ml
            case 6:
                return new char[][]{{'*'}, {'*'}, {'*'}}; // i
            default:
                return new char[][]{{}};
        }
    }

}
