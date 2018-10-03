package com.gmail.blanutsa.dmitriy.view;

import com.gmail.blanutsa.dmitriy.model.Matrix;

public class View {

    public void showMatrix(Matrix matrix) {
        for (short[] row : matrix.getData()) {
            for (short element : row) {
                System.out.printf("%5d ", element);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void showText(String text) {
        System.out.println(text);
    }
}
