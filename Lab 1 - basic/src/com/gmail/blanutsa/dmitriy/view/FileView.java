package com.gmail.blanutsa.dmitriy.view;

import com.gmail.blanutsa.dmitriy.model.Matrix;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileView implements View{

    private String fileName;

    public FileView(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void showMatrix(Matrix matrix) {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream( fileName, true))) {
            for (short[] row : matrix.getData()) {
                for (short element : row) {
                    pw.printf("%7d", element);
                }
                pw.println();
            }
            pw.println();
        } catch (IOException e) {}
    }

    @Override
    public void showText(String text) {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(fileName, true))) {
            pw.println(text);
        } catch (IOException e) {}
    }
}
