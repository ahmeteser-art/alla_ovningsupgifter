package se.chasacademy.ahmeteser.fritidslagret.alla_veckor.vecka2;

public class Bygg_en_meny {
    /*
    Uppgift 3: Bygg en meny med while-loop
    Skapa en enkel meny som visas tills användaren väljer att avsluta programmet.

    Meny:

    1. Skriv ut en hälsning
    2. Beräkna kvadraten av ett tal
    3. Avsluta
    Använd:

    while
    switch
    användarinmatning
    Programmet ska fortsätta visa menyn tills användaren väljer alternativ 3.
     */
    void main(){

        int choice=0;

        while(choice!=3){

            IO.println("\nMeny:");
            IO.println("1. Skriv ut en hälsning");
            IO.println("2. Beräkna kvadraten av ett tal");
            IO.println("3. Avsluta");

            // Get user input
            String input = IO.readln("Välj ett alternativ (1-3): ");
            choice = Integer.parseInt(input);

            switch (choice){
                case 1 -> IO.println("hhey och welkommen!");
                case 2 -> {

                    String getNumber = IO.readln("please enter a number: ");
                    int number = Integer.parseInt(getNumber);
                    double square = number * number;
                    IO.println("Kvadraten av " + number + " är: " + square);
                }

                case 3 -> IO.println("Avslutar programmet...");

                default -> IO.println("Ogiltigt val. Försök igen.");
            }

        }
    }
}
