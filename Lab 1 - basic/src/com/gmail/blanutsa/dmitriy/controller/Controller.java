package com.gmail.blanutsa.dmitriy.controller;

import com.gmail.blanutsa.dmitriy.model.Matrix;
import com.gmail.blanutsa.dmitriy.service.MatrixService;
import com.gmail.blanutsa.dmitriy.view.View;

public class Controller {

    private View view = new View();
    private Matrix matrix;
    private MatrixService matrixService;

    public Controller(Matrix matrix) {
        this.matrix = matrix;
        matrixService = new MatrixService(matrix);
    }

    public Controller(Matrix matrix, View view) {
        this.matrix = matrix;
        this.view = view;
        matrixService = new MatrixService(matrix);
    }

    public void execute() {
        view.showText("Source matrix:\r\n");
        view.showMatrix(matrix);

        matrixService.sortRowsMatrixByIndex(matrix.getParametr());

        view.showText("Result matrix:\r\n");
        view.showMatrix(matrix);
    }
}
