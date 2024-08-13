package com.practice;

import java.util.Scanner;
import java.util.Random;

public class BlockyPuzzleGame {
    private static final int WIDTH = 10;
    private static final int HEIGHT = 20;
    private static char[][] board = new char[HEIGHT][WIDTH];
    private static final char EMPTY = '.';
    private static final char BLOCK = '#';

    private static char[][][] blocks = {
        { // I-shape
            {EMPTY, EMPTY, EMPTY, EMPTY},
            {BLOCK, BLOCK, BLOCK, BLOCK},
            {EMPTY, EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY, EMPTY}
        },
        { // O-shape
            {BLOCK, BLOCK},
            {BLOCK, BLOCK}
        },
        { // T-shape
            {EMPTY, BLOCK, EMPTY},
            {BLOCK, BLOCK, BLOCK},
            {EMPTY, EMPTY, EMPTY}
        },
        { // L-shape
            {BLOCK, EMPTY, EMPTY},
            {BLOCK, BLOCK, BLOCK},
            {EMPTY, EMPTY, EMPTY}
        },
        { // J-shape
            {EMPTY, EMPTY, BLOCK},
            {BLOCK, BLOCK, BLOCK},
            {EMPTY, EMPTY, EMPTY}
        },
        { // S-shape
            {EMPTY, BLOCK, BLOCK},
            {BLOCK, BLOCK, EMPTY},
            {EMPTY, EMPTY, EMPTY}
        },
        { // Z-shape
            {BLOCK, BLOCK, EMPTY},
            {EMPTY, BLOCK, BLOCK},
            {EMPTY, EMPTY, EMPTY}
        }
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        initBoard();

        char[][] block = blocks[random.nextInt(blocks.length)];
        int blockX = WIDTH / 2 - block[0].length / 2;
        int blockY = 0;

        while (true) {
            printBoard();
            System.out.println("Use 'a' to move left, 'd' to move right, 's' to move down, 'w' to rotate.");
            char command = scanner.next().charAt(0);

            // Clear block from board
            removeBlock(block, blockX, blockY);

            // Move or rotate block based on user input
            switch (command) {
                case 'a':
                    if (canMove(block, blockX - 1, blockY)) blockX--;
                    break;
                case 'd':
                    if (canMove(block, blockX + 1, blockY)) blockX++;
                    break;
                case 's':
                    if (canMove(block, blockX, blockY + 1)) blockY++;
                    break;
                case 'w':
                    char[][] rotatedBlock = rotateBlock(block);
                    if (canMove(rotatedBlock, blockX, blockY)) block = rotatedBlock;
                    break;
                default:
                    System.out.println("Invalid command. Use 'a', 'd', 's', or 'w'.");
            }

            // Place block on board
            placeBlock(block, blockX, blockY);

            // Check if block has reached the bottom or is on top of another block
            if (!canMove(block, blockX, blockY + 1)) {
                if (blockY == 0) {
                    System.out.println("Game Over!");
                    break;
                }
                block = blocks[random.nextInt(blocks.length)];
                blockX = WIDTH / 2 - block[0].length / 2;
                blockY = 0;
            }
        }

        scanner.close();
    }

    private static void initBoard() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void placeBlock(char[][] block, int x, int y) {
        for (int i = 0; i < block.length; i++) {
            for (int j = 0; j < block[i].length; j++) {
                if (block[i][j] == BLOCK) {
                    board[y + i][x + j] = BLOCK;
                }
            }
        }
    }

    private static void removeBlock(char[][] block, int x, int y) {
        for (int i = 0; i < block.length; i++) {
            for (int j = 0; j < block[i].length; j++) {
                if (block[i][j] == BLOCK) {
                    board[y + i][x + j] = EMPTY;
                }
            }
        }
    }

    private static boolean canMove(char[][] block, int x, int y) {
        for (int i = 0; i < block.length; i++) {
            for (int j = 0; j < block[i].length; j++) {
                if (block[i][j] == BLOCK) {
                    int newX = x + j;
                    int newY = y + i;

                    if (newX < 0 || newX >= WIDTH || newY < 0 || newY >= HEIGHT || board[newY][newX] == BLOCK) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static char[][] rotateBlock(char[][] block) {
        int n = block.length;
        int m = block[0].length;
        char[][] rotatedBlock = new char[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotatedBlock[j][n - 1 - i] = block[i][j];
            }
        }
        return rotatedBlock;
    }
}

