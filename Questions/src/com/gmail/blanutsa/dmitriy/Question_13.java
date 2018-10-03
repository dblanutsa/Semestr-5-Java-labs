package com.gmail.blanutsa.dmitriy;

public class Question_13 {

    public static void main(String[] args) {
        A a = new A();
        a.setX(5);
        System.out.println(a.getX());
    }
}

class A {
    private int x;

    public void setX (int x) {
        x = x;
    }

    public int getX() {
        return x;
    }
}

//B - 0
