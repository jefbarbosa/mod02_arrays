package com.meli;

import java.util.Scanner;

public class Main {

    public static void readIntoMatrix(int[][] matrix) {

        Scanner IntScanner = new Scanner(System.in);

        int input;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                input = IntScanner.nextInt();
                matrix[j][i] = input*2;
            }
        }

    }

    public static void printMatrix(int[][] matrix) {

        for (int j = 0; j < 3; j++) {

            for (int i = 0; i < 3; i++) {
                System.out.print(" "+ matrix[j][i]);

            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        int[][] matrix = new int[3][3];

        readIntoMatrix(matrix);

        printMatrix(matrix);

    }
}
