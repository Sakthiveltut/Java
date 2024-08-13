package com.practice;

class AreaCalculator {

    // Method to calculate the area of a circle (requires radius)
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Overloaded method to calculate the area of a rectangle (requires width and height)
    public double calculateArea(double width, double height) {
        return width * height;
    }
    
    // Overloaded method to calculate the area of a triangle (requires base and height)
    public double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        } else {
            throw new IllegalArgumentException("Invalid parameters for calculating area of a triangle.");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Calculate the area of a circle
        double circleArea = calculator.calculateArea(5.0); // Calls calculateArea(double radius)
        System.out.println("Area of the circle: " + circleArea);

        // Calculate the area of a rectangle
        double rectangleArea = calculator.calculateArea(10.0, 20.0); // Calls calculateArea(double width, double height)
        System.out.println("Area of the rectangle: " + rectangleArea);

        // Calculate the area of a triangle
        double triangleArea = calculator.calculateArea(10.0, 15.0, true); // Calls calculateArea(double base, double height, boolean isTriangle)
        System.out.println("Area of the triangle: " + triangleArea);
    }
}

