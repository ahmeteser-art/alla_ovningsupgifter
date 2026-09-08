package se.chasacademy.ahmeteser.fritidslagret.mob_quiz.mob_quiz1;

import java.util.Scanner;

public class workshop3_OldJava {
    public static void main(String[] args) {
        int correctAnswers = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Välkommen");

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        System.out.print("Vilket nyckelord används för beslut i Java? ");
        String question = scanner.nextLine();
        if (question.equals("if")) {
            System.out.println("Rätt!");
            correctAnswers += 1;
        }
        if (!question.equals("if")) {
            System.out.println("Fel!");
        }

        System.out.println("Fråga 2:");
        System.out.print("Vad blir 1+1? ");
        String question2 = scanner.nextLine();
        if (question2.equals("2")) {
            System.out.println("Rätt!");
            correctAnswers += 1;
        }
        if (!question2.equals("2")) {
            System.out.println("Fel!");
        }
        System.out.println(name + ", du svarade rätt på " + correctAnswers + " av 3 frågor!");
}
}
