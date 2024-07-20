package com.cheat_sheet;

public class Q06 {
    public static void main(String[] args) {
        String hexNumber = "1A3F"; 

        String binaryNumber = convertHexToBinary(hexNumber);

        System.out.println("Hexadecimal: " + hexNumber);
        System.out.println("Binary: " + binaryNumber);
    }

    public static String convertHexToBinary(String hex) {
        int decimal = Integer.parseInt(hex, 16);
        System.out.println(decimal);
        String binary = Integer.toBinaryString(decimal);
        
        return binary;
    }
}

/*
public class HexToBinary {
    public static void main(String[] args) {
        String hexNumber = "1A3F";

        String binaryNumber = convertHexToBinary(hexNumber);

        System.out.println("Hexadecimal: " + hexNumber);
        System.out.println("Binary: " + binaryNumber);
    }

    public static String convertHexToBinary(String hex) {
        String[] hexToBinaryMap = {
            "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };

        StringBuilder binary = new StringBuilder();

        for (char hexDigit : hex.toCharArray()) {
            int hexValue = hexToDecimal(hexDigit);
            binary.append(hexToBinaryMap[hexValue]);
        }

        return binary.toString();
    }

    public static int hexToDecimal(char hexDigit) {
        if (hexDigit >= '0' && hexDigit <= '9') {
            return hexDigit - '0';
        } else if (hexDigit >= 'A' && hexDigit <= 'F') {
            return hexDigit - 'A' + 10;
        } else if (hexDigit >= 'a' && hexDigit <= 'f') {
            return hexDigit - 'a' + 10;
        } else {
            throw new IllegalArgumentException("Invalid hexadecimal digit: " + hexDigit);
        }
    }
}
 */

