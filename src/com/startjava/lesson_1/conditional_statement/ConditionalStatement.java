package com.startjava.lesson_1.conditional_statement;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 30;
        if (age > 20) {
            System.out.println("Вам больше 20-ти лет!");
        }

        boolean male = true;
        if (male) {
            System.out.println("Вы мужчина!");
        }

        if (!male) {
            System.out.println("Вы женщина!");
        }

        double growth = 1.85;
        if (growth < 1.80) {
            System.out.println("Ваш рост ниже среднего!");
        } else {
            System.out.println("Ваш рост выше среднего!");
        }

        char firstLetterOfName = 'A';
        if (firstLetterOfName == 'M') {
            System.out.println("Первая буква вашего имени : " + firstLetterOfName);
        } else if (firstLetterOfName == 'I') {
            System.out.println("Первая буква вашего имени : " + firstLetterOfName);
        } else {
            System.out.println("Ваше имя начинается не с \"M\" и не с \"I\"");
        }
    }
}