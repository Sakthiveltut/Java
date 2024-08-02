package com.practice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SnakeGame {
	private static final char EMPTY_CELL = '.';
	private static final char SNAKE_CELL = 'O';
	private static final char FOOD_CELL = 'X';
	private static final byte ROWS = 20;
	private static final byte COLS = 20;
	private static ArrayList<int[]> snake = new ArrayList<>();
	private static byte direction = 1;//up=1, right=2, down=3, left=4
	private static byte food[] = new byte[2];
	private static char grid[][] = new char[ROWS][COLS];
	private static boolean isGameOver = false;
	private static final byte INITIAL_SNAKE_LENGTH = 3; 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		intializeGrid();
		while(!isGameOver) {
			printGrid();
			System.out.println("Enter your move(WASD): ");
			char move = scanner.next().charAt(0);
			setDirection(move);
			updateGame();
		}
		
		System.out.println("Score: "+(snake.size() - INITIAL_SNAKE_LENGTH));
	}

	private static void updateGame() {
		int head[] = snake.get(0);
		int row = head[0], col=head[1];
		
		if(direction==1) row = (row-1+ROWS)%ROWS;
		else if(direction==2) col = (col+1)%COLS;
		else if(direction==3) row = (row+1)%ROWS;
		else if(direction==4) col = (col-1+COLS)%COLS;
		
		if(grid[row][col]==SNAKE_CELL) {
			isGameOver = true;
			System.out.println("Game over.");
			return;
		}
		
		snake.add(0, new int[]{row, col});
		grid[row][col] = SNAKE_CELL;
		
		if(food[0]==row && food[1]==col) {
			placeFood();
		}else {
			int[] tail = snake.remove(snake.size()-1);
			grid[tail[0]][tail[1]] = EMPTY_CELL;
		}
	}

	private static void setDirection(char move) {
		switch(move) {
			case 'w':
			case 'W':
				if(direction!=3) direction=1;
				break;
			case 'd':
			case 'D':
				if(direction!=4) direction=2;
				break;
			case 's':
			case 'S':
				if(direction!=1) direction=3;
				break;
			case 'a':
			case 'A':
				if(direction!=2) direction=4;
				break;
		}
	}

	private static void printGrid() {
		for(int i=0;i<ROWS;i++) {
			for(int j=0;j<COLS;j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}

	private static void intializeGrid() {
		for(int i=0;i<ROWS;i++) {
			for(int j=0;j<COLS;j++) {
				grid[i][j] = EMPTY_CELL;
			}
		}
		
		for(int i=0;i<INITIAL_SNAKE_LENGTH;i++) {
			int row = (ROWS/2)+i, col = COLS/2;
			snake.add(i,new int[] {row, col});
			grid[row][col] = SNAKE_CELL;
		}
		
		placeFood();
	}

	private static void placeFood() {
		Random random = new Random();
		do {
			food[0]=(byte) random.nextInt(ROWS);
			food[1]=(byte) random.nextInt(COLS);
		}while(grid[food[0]][food[1]]==SNAKE_CELL);
		
		grid[food[0]][food[1]] = FOOD_CELL;
	}
	
}
