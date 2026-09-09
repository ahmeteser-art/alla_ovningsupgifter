package se.chasacademy.ahmeteser.fritidslagret.cafesystem;

import java.util.Scanner;

public class CafeSystem {
    import java.util.Scanner;

    public class CafeSystem {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Vad heter du? ");
            String name = scanner.nextLine();

            System.out.print("Hur många kaffekoppar vill du köpa? ");
            int cups = scanner.nextInt();

            int pricePerCup = 25;
            int total = cups * pricePerCup;

            if (cups > 5) {
                total = total - (total * 10 / 100);
            }

            System.out.println("Hej " + name + "!");
            System.out.println("Totalsumman är " + total + " kr.");
        }
    }
}
