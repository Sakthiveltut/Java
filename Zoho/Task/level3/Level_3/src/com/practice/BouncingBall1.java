package com.practice;

public class BouncingBall1 {
    public static void main(String[] args) {
        final int width = 20;
        final int height = 10;
        int ballX = 1;
        int ballY = 1;
        int ballVelocityX = 1;
        int ballVelocityY = 1;

        while (true) {
            // Clear the screen
            clearScreen();

            // Check for collision with walls and reflect the ball
            if (ballX + ballVelocityX <= 0 || ballX + ballVelocityX >= width - 1) {
                ballVelocityX = -ballVelocityX;
            }
            if (ballY + ballVelocityY <= 0 || ballY + ballVelocityY >= height - 1) {
                ballVelocityY = -ballVelocityY;
            }

            // Update ball position
            ballX += ballVelocityX;
            ballY += ballVelocityY;

            // Draw the grid with the ball
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    if (x == ballX && y == ballY) {
                        System.out.print("O"); // Ball character
                    } else if (x == 0 || x == width - 1 || y == 0 || y == height - 1) {
                        System.out.print("#"); // Wall character
                    } else {
                        System.out.print(" "); // Empty space
                    }
                }
                System.out.println();
            }

            // Pause for a moment
            try {
                Thread.sleep(200); // Adjust the speed of the game here
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Method to clear the screen
    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
