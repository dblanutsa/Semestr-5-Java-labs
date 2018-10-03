package com.gmail.blanutsa.dmitriy.service;

import com.gmail.blanutsa.dmitriy.model.Matrix;

public class MatrixService {

    private Matrix matrix;

    public MatrixService(Matrix matrix) {
        this.matrix = matrix;
    }

    public void sortRowsMatrixByIndex(int k) {
        int size = matrix.getData().length;

        for(int i = 0; i < size; i++){
            for(int j = 1; j < size - i; j++){
                if(matrix.getData()[j - 1][k] > matrix.getData()[j][k]){
                    rowsSwap(j - 1, j);
                }

            }
        }
    }

    private void rowsSwap(int i, int j) {
        short[] temp = matrix.getData()[i];
        matrix.getData()[i] = matrix.getData()[j];
        matrix.getData()[j] = temp;
    }
}
