package com.gmail.blanutsa.dmitriy;

import com.gmail.blanutsa.dmitriy.controller.Controller;
import com.gmail.blanutsa.dmitriy.model.Matrix;
import com.gmail.blanutsa.dmitriy.service.MatrixService;
import com.gmail.blanutsa.dmitriy.util.Util;

public class Application {

    static int minMatrixSize = 2;
    static int maxMatrixSize = 10;

    public static void main(String[] args) {
        System.out.println("Dmitriy Blanutsa, IP-61");
        System.out.println("Lab 1 (basic), variant - 1\r\n");

        System.out.printf("Enter size of square matrix (in range %d, %d): ", minMatrixSize, maxMatrixSize);
        short size = Util.scanShortValue(minMatrixSize, maxMatrixSize);
        System.out.println();


        Matrix matrix = Util.matrixInit(size);

        Controller controller = new Controller(matrix);

        controller.execute();
    }
}
