package se.chasacademy.ahmeteser.fritidslagret.alla_veckor.vecka1;

public class ovningsuppgift_3 {

    void main() {
        //Uppgift 3: Omvandla text till heltal
        //I denna uppgift skapar vi ett program som läser in ett heltal som text,
        // omvandlar det till ett heltal, och skriver ut nästa heltal.

        //När vi har läst in text behöver vi omvandla texten till ett heltal.
        //Heltal definieras av typen int, som är en förkortning av engelskans "Integer".
        //
        //Skriv ett program, som i sin main-metod frågar efter en siffra med texten

        String input = IO.readln("please give me a number to increment\n");
try {
    int number  =Integer.parseInt(input);


    //IO.println(number);
    //Give me a number to increment:, ökar siffran med 1, och skriver ut siffrans nya värde med texten Your new number is #.
    number = number + 1;

    IO.println("Your new number is " + number);

}catch (NumberFormatException exception){
    IO.println(" wrong! you have to give a number ");
    System.exit(1);
}

    }
    //T.ex om siffran är 3, så skriver programmet ut Your new number is 4.
    //Om man anger något annat än ett heltal kommer programmet att krascha, det är ok i denna uppgift.
}
