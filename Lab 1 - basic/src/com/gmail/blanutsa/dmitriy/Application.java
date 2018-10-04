package com.gmail.blanutsa.dmitriy;

import com.gmail.blanutsa.dmitriy.controller.Controller;
import com.gmail.blanutsa.dmitriy.model.Matrix;
import com.gmail.blanutsa.dmitriy.util.Util;
import com.gmail.blanutsa.dmitriy.view.ConsoleView;
import com.gmail.blanutsa.dmitriy.view.FileView;
import com.gmail.blanutsa.dmitriy.view.View;

import java.util.Scanner;

import static com.gmail.blanutsa.dmitriy.util.Util.scanShortValue;

public class Application {

    private static int minMatrixSize = 2;
    private static int maxMatrixSize = 10;
    private static Controller controller;

    public static void main(String[] args) {
        System.out.println("Dmitriy Blanutsa, IP-61");
        System.out.println("Lab 1 (basic), variant - 1\r\n");

        controller = new Controller(selectOutputMethod());

        workWithMatrix();
    }

    private static void workWithMatrix() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.printf("Enter size of square matrix (in range %d, %d): ", minMatrixSize, maxMatrixSize);
            short size = scanShortValue(minMatrixSize, maxMatrixSize);
            System.out.println();

            Matrix matrix = Util.matrixInit(size);

            controller.execute(matrix);

            System.out.println("To complete enter \'n\' or \'N\': ");
            String value = scanner.next();
            System.out.println("\r\n");
            if (value.equals("n") || value.equals("N")) {
                return;
            }
        } while (true);
    }

    private static View selectOutputMethod() {
        System.out.println("Choose how to display the result: ");
        System.out.println("1 - console");
        System.out.println("2 - file");
        short value = scanShortValue(1, 2);
        return value == 1 ? new ConsoleView() : new FileView("Matrix.txt");
    }
}
