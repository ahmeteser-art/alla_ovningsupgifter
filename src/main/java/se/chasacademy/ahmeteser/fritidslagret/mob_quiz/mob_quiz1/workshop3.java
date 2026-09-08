package se.chasacademy.ahmeteser.fritidslagret.mob_quiz.mob_quiz1;

public class workshop3 {
    void main() {
        int correctAnswers = 0;
        IO.println("Välkommen");
        String name = IO.readln("Please enter your name: ");
        IO.println("Hello " + name);

        String question = IO.readln("Vilket nyckelord används för beslut i Java?");
        if (question.equals("if")) {
            IO.println("Rätt!");
            correctAnswers++;
        }
        if (!question.equals("if")) {
            IO.println("Fel!");
        }

        IO.println("Fråga 2:");
        String question2 = IO.readln("Vad blir 1+1?");
        if (Integer.parseInt(question2) == 2) {
            IO.println("Rätt!");
            correctAnswers++;
        }
        if (Integer.parseInt(question2) != 2) {
            IO.println("Fel!");
        }
        IO.print(name + ", du svarade rätt på "
                + correctAnswers + " av 3 frågor!"
        );
}
}
