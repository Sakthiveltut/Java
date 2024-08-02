package com.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SnakeGame1 {
    private static final int WIDTH = 20;
    private static final int HEIGHT = 20;
    private static final char EMPTY_CELL = '.';
    private static final char SNAKE_CELL = 'O';
    private static final char FOOD_CELL = 'X';
    private static final int INITIAL_SNAKE_LENGTH = 3;
    
    private static char[][] grid = new char[WIDTH][HEIGHT];
    private static List<int[]> snake = new ArrayList<>();
    private static int[] food = new int[2];
    private static int direction = 0; // 0 = Up, 1 = Right, 2 = Down, 3 = Left
    private static boolean gameOver = false;
    
    public static void main(String[] args) {
        initializeGame();
        Scanner scanner = new Scanner(System.in);
        
        while (!gameOver) {
            printGrid();
            System.out.print("Enter direction (WASD): ");
            char input = scanner.next().charAt(0);
            changeDirection(input);
            updateGame();
        }
        
        System.out.println("Game Over! Your final score is: " + (snake.size() - INITIAL_SNAKE_LENGTH));
        scanner.close();
    }
    
    private static void initializeGame() {
        // Initialize grid
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                grid[i][j] = EMPTY_CELL;
            }
        }

        // Initialize snake
        for (int i = 0; i < INITIAL_SNAKE_LENGTH; i++) {
            int[] segment = {WIDTH / 2, HEIGHT / 2 + i};
            snake.add(segment);
            grid[segment[0]][segment[1]] = SNAKE_CELL;
        }
        
        // Initialize food
        placeFood();
    }
    
    private static void placeFood() {
        Random rand = new Random();
        do {
            food[0] = rand.nextInt(WIDTH);
            food[1] = rand.nextInt(HEIGHT);
        } while (grid[food[0]][food[1]] == SNAKE_CELL);
        
        grid[food[0]][food[1]] = FOOD_CELL;
    }
    
    private static void printGrid() {
        // Clear console
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                System.out.print(grid[x][y]);
            }
            System.out.println();
        }
    }
    
    private static void changeDirection(char input) {
        switch (input) {
            case 'w':
            case 'W':
                if (direction != 2) direction = 0; // Up
                break;
            case 'd':
            case 'D':
                if (direction != 3) direction = 1; // Right
                break;
            case 's':
            case 'S':
                if (direction != 0) direction = 2; // Down
                break;
            case 'a':
            case 'A':
                if (direction != 1) direction = 3; // Left
                break;
        }
    }
    
    private static void updateGame() {
        // Get head position
        int[] head = snake.get(0);
        int newX = head[0];
        int newY = head[1];
        
        // Calculate new head position with wrapping
        switch (direction) {
            case 0: newY = (newY - 1 + HEIGHT) % HEIGHT; break; // Up
            case 1: newX = (newX + 1) % WIDTH; break; // Right
            case 2: newY = (newY + 1) % HEIGHT; break; // Down
            case 3: newX = (newX - 1 + WIDTH) % WIDTH; break; // Left
        }
        
        // Check for collisions with the snake itself
        if (grid[newX][newY] == SNAKE_CELL) {
            gameOver = true;
            return;
        }
        
        for(int[] arr:snake) {
        	System.out.println(Arrays.toString(arr));        	
        }
        
        // Move snake
        snake.add(0, new int[] { newX, newY });
        grid[newX][newY] = SNAKE_CELL;
        
        // Check if food is eaten
        if (newX == food[0] && newY == food[1]) {
            placeFood();
        } else {
            // Remove tail
            int[] tail = snake.remove(snake.size() - 1);
            grid[tail[0]][tail[1]] = EMPTY_CELL;
        }
    }
}

