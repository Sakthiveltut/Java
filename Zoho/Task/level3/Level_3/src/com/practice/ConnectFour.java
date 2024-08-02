package com.practice;

import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;

public class ConnectFour {
    private static final int ROWS = 6;
    private static final int COLS = 7;
    private static final char EMPTY_SLOT = '.';
    private static final char PLAYER_ONE = 'X';
    private static final char PLAYER_TWO = 'O';

    public static void main(String[] args) {
        char[][] board = new char[ROWS][COLS];
        initializeBoard(board);
        boolean isPlayerOneTurn = true;
        boolean gameWon = false;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (!gameWon && !isBoardFull(board)) {
            printBoard(board);
            int col;

            if (isPlayerOneTurn) {
                System.out.println("Player 1 (X), choose a column (1-7): ");
                col = scanner.nextInt() - 1;
                if (col < 0 || col >= COLS) {
                    System.out.println("Column out of bounds, try again.");
                    continue;
                }
            } else {
                col = random.nextInt(COLS);
                System.out.println("Computer (O) chooses column " + (col + 1));
            }

            if (!dropDisc(board, col, isPlayerOneTurn ? PLAYER_ONE : PLAYER_TWO)) {
                System.out.println("Column is full, try again.");
                continue;
            }

            if (checkForWin(board, isPlayerOneTurn ? PLAYER_ONE : PLAYER_TWO)) {
                gameWon = true;
                printBoard(board);
                if (isPlayerOneTurn) {
                    System.out.println("Player 1 (X) wins!");
                } else {
                    System.out.println("Computer (O) wins!");
                }
            } else {
                isPlayerOneTurn = !isPlayerOneTurn;
            }
        }

        if (!gameWon) {
            printBoard(board);
            System.out.println("It's a tie!");
        }

        scanner.close();
    }

    private static void initializeBoard(char[][] board) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = EMPTY_SLOT;
            }
        }
    }

    private static void printBoard(char[][] board) {
        for (int i = 0; i < COLS; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean dropDisc(char[][] board, int col, char disc) {
        for (int i = ROWS - 1; i >= 0; i--) {
            if (board[i][col] == EMPTY_SLOT) {
                board[i][col] = disc;
                return true;
            }
        }
        return false;
    }

    private static boolean checkForWin(char[][] board, char disc) {
        // Check horizontal
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS - 3; j++) {
                if (board[i][j] == disc && board[i][j + 1] == disc && board[i][j + 2] == disc && board[i][j + 3] == disc) {
                    return true;
                }
            }
        }

        // Check vertical
        for (int i = 0; i < ROWS - 3; i++) {
            for (int j = 0; j < COLS; j++) {
                if (board[i][j] == disc && board[i + 1][j] == disc && board[i + 2][j] == disc && board[i + 3][j] == disc) {
                    return true;
                }
            }
        }

        // Check diagonal (bottom left to top right)
        for (int i = 3; i < ROWS; i++) {
            for (int j = 0; j < COLS - 3; j++) {
                if (board[i][j] == disc && board[i - 1][j + 1] == disc && board[i - 2][j + 2] == disc && board[i - 3][j + 3] == disc) {
                    return true;
                }
            }
        }

        // Check diagonal (top left to bottom right)
        for (int i = 0; i < ROWS - 3; i++) {
            for (int j = 0; j < COLS - 3; j++) {
                if (board[i][j] == disc && board[i + 1][j + 1] == disc && board[i + 2][j + 2] == disc && board[i + 3][j + 3] == disc) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < COLS; i++) {
            if (board[0][i] == EMPTY_SLOT) {
                return false;
            }
        }
        return true;
    }
}

