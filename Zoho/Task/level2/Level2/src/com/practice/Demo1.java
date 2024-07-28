package com.practice;

public class Demo1 {
    public static void main(String[] args) {
        int number = 10;
        
        // Convert integer to binary using custom method
        String binaryString = convertToBinary(number);
        
        System.out.println("The binary representation of " + number + " is: " + binaryString);
    }
    
    public static String convertToBinary(int number) {
        if (number == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.insert(0, number % 2);
            number = number / 2;
            System.out.println(binary);
        }
        
        return binary.toString();
    }
}





