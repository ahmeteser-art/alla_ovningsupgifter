package se.chasacademy.ahmeteser.fritidslagret.alla_veckor.vecka1;

public class ovningsuppgift_4 {
    void main() {

        String numberText = IO.readln("Give me a number less than zero:\n");
        int number = Integer.parseInt(numberText);

        if (number < 0) {
            IO.println("Thank you!");

        }else {
            IO.println("please enter a negative number ");
            System.exit(1);
        }
    }

/*
    Uppgift 4: Villkor
    I denna uppgift skapar vi ett program som läser in en siffra,
    omvandlar det till ett heltal, och om siffran är mindre än 0 skriver ut text, annars skrivs inget ut.

    För att kontrollera villkor använder vi oss av nyckelordet if.

    Skriv ett program, som i sin main-metod frågar efter en siffra med texten

    Give me a number less than zero:,
    kontrollerar villkoret,
    och
    om siffran är mindre än 0,

    skriver ut Thank you!.
 */
}
