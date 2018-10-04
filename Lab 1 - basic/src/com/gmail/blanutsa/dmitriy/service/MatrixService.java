package com.gmail.blanutsa.dmitriy.service;

import com.gmail.blanutsa.dmitriy.model.Matrix;

public class MatrixService {

    public void sortRowsMatrixByIndex(Matrix matrix) {
        int size = matrix.getData().length;
        int k = matrix.getParametr();

        for(int i = 0; i < size; i++){
            for(int j = 1; j < size - i; j++){
                if(matrix.getData()[j - 1][k] > matrix.getData()[j][k]){
                    rowsSwap(matrix, j - 1, j);
                }

            }
        }
    }

    private void rowsSwap(Matrix matrix, int i, int j) {
        short[] temp = matrix.getData()[i];
        matrix.getData()[i] = matrix.getData()[j];
        matrix.getData()[j] = temp;
    }
}
