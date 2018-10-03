package com.gmail.blanutsa.dmitriy.model;

public class Matrix {

    private short[][] data;
    private int parametr;

    public Matrix(short[][] data, int parametr) {
        this.data = data;
        this.parametr = parametr;
    }

    public short[][] getData() {
        return data;
    }

    public void setData(short[][] data) {
        this.data = data;
    }

    public int getParametr() {
        return parametr;
    }
}
