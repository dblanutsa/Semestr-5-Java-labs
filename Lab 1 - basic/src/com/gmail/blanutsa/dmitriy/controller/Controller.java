package com.gmail.blanutsa.dmitriy.controller;

import com.gmail.blanutsa.dmitriy.model.Matrix;
import com.gmail.blanutsa.dmitriy.service.MatrixService;
import com.gmail.blanutsa.dmitriy.view.View;

public class Controller {

    private View view;
    private MatrixService matrixService = new MatrixService();

    public Controller(View view) {
        this.view = view;
    }

    public void execute(Matrix matrix) {
        view.showText("Source matrix:\r\n");
        view.showMatrix(matrix);

        matrixService.sortRowsMatrixByIndex(matrix);

        view.showText("Result matrix:\r\n");
        view.showMatrix(matrix);
    }
}
