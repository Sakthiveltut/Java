package com.cheat_sheet;

public class Q38 {
    
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int[][] matrix = {
	        { 1, 2, -1, -4, -20 },
	        { -8, -3, 4, 2, 1 },
	        { 3, 8, 10, 1, 3 },
	        { -4, -1, 1, 7, -6 },
        };
        
        int topLeftRow = 1, topLeftCol = 1;
        int bottomRightRow = 3, bottomRightCol = 3;
        
        printRectangleAndSum(matrix, topLeftRow, topLeftCol, bottomRightRow, bottomRightCol);
    }
    
    public static void printRectangleAndSum(int[][] matrix, int topLeftRow, int topLeftCol, int bottomRightRow, int bottomRightCol) {
        int sum = 0;
        
        System.out.println("The rectangle is:");
        for (int i = topLeftRow; i <= bottomRightRow; i++) {
            for (int j = topLeftCol; j <= bottomRightCol; j++) {
                System.out.print(matrix[i][j] + " ");
                sum += matrix[i][j];
            }
            System.out.println();
        }
        
        System.out.println("The sum of the elements in the rectangle is: " + sum);
    }
}

