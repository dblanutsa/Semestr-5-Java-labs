package com.gmail.blanutsa.dmitriy;

public class Question_12 {
    String name = "Java";

    public static void main(String[] args) {
        Question_12 courses[] = {new Question_12(), new Question_12()};
        courses[0].name = "Mega";
        for (Question_12 cours : courses)
            cours = new Question_12();
        for (Question_12 cours : courses)
            System.out.println(cours.name);
    }
}

// B
