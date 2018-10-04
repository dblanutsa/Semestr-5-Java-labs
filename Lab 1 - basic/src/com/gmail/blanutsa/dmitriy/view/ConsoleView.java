package com.gmail.blanutsa.dmitriy.view;

import com.gmail.blanutsa.dmitriy.model.Matrix;

public class ConsoleView implements View {

    @Override
    public void showMatrix(Matrix matrix) {
        for (short[] row : matrix.getData()) {
            for (short element : row) {
                System.out.printf("%7d", element);
            }
            System.out.println();
        }
        System.out.println();
    }

    @Override
    public void showText(String text) {
        System.out.println(text);
    }
}
