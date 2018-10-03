package com.gmail.blanutsa.dmitriy.util;

import com.gmail.blanutsa.dmitriy.model.Matrix;
import java.util.Scanner;

public class Util {

    public static short[][] generateMatrix(int size) {
        short[][] matrix = new short[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (short) (Math.random() * Short.MAX_VALUE);
            }
        }
        return matrix;
    }

    public static short[][] scanMatrix(int size) {
        short[][] matrix = new short[size][size];

        System.out.printf("Scanning a square matrix of dimension %d.\r\n", size);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("Enter %d element for %d row: ", j + 1, i + 1);
                matrix[i][j] = scanShortValue(Short.MIN_VALUE, Short.MAX_VALUE);
            }
        }

        return matrix;
    }

    public static short scanShortValue(int min, int max) {
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                short value =  Short.parseShort(scanner.next());
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.printf("Value will be in range %d, %d!\r\n", min, max);
                    System.out.println("Enter value again: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR!!! Type of value is not short!");
                System.out.println("Enter value again: ");
            }
        } while (true);
    }

    public static Matrix matrixInit(int size) {
        System.out.println("Enter k-element of matrix: ");
        short k = scanShortValue(0, size - 1);
        System.out.println();

        System.out.println("Enter a way to initialize the matrix: ");
        System.out.println("1 - generate");
        System.out.println("2 - manual input");
        short value = scanShortValue(1, 2);

        System.out.println();

        short[][] data = value == 1 ? Util.generateMatrix(size) : Util.scanMatrix(size);
        return new Matrix(data, k);
    }
}
