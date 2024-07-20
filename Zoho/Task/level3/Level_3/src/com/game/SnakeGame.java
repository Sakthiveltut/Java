package com.game;

import java.util.Arrays;
import java.util.Scanner;

public class SnakeGame {
	private static Scanner scanner = new Scanner(System.in);
	private static final Byte LEFT=1,RIGHT=2,EXIT=3;
	
	public static void main(String[] args) {
		
		char[][] matrix = new char[4][4];
		
		for(byte i=0;i<matrix.length;i++) {
			for(byte j=0;j<matrix.length;j++) {
				matrix[i][j] = '#';
			}
		}
		matrix[0][0] = '*';
		
		
		for(byte i=0;i<matrix.length;i++) {
			for(byte j=0;j<matrix.length;j++) {
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println();
		}
		boolean exit = false;
		while(!exit) {
			System.out.println("1.Left\n2.Right\n3.Exit");
			byte choice = scanner.nextByte();
			if(LEFT==choice) {

			}else if(RIGHT==choice) {
				
			}else if(EXIT==choice) {
				
			}
		}
	}
}
