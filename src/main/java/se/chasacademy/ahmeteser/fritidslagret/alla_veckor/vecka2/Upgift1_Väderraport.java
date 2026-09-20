package se.chasacademy.ahmeteser.fritidslagret.alla_veckor.vecka2;

import java.util.Arrays;

public class Upgift1_Väderraport {
    /*
    Uppgift 1: Väderrapport
    Skapa en variabel av typen enum som heter Weather.

    Enum:en ska innehålla följande värden:

    SUNNY
    CLOUDY
    RAINY
    SNOWY
    Skapa en variabel med valfritt väder och använd en switch-sats för att skriva ut ett lämpligt meddelande.

    Exempelutskrift:

    Det är soligt idag.
     */
 void main() {

     Weather weather= Weather.SNOWY;

    weather= Weather.SUNNY;

      switch (weather){
          case SUNNY  -> IO.println("The weather is "+ weather+" today");
          case CLOUDY ->  IO.println("The weather is "+ weather+" today");
          case RAINY ->  IO.println("The weather is "+ weather+" today");
          case SNOWY ->  IO.println("The weather is "+ weather+" today");
      }

     Weather[] values = Weather.values();

     IO.println(Arrays.toString(values));
 }




   public enum Weather{
        SUNNY,
        CLOUDY,
        RAINY,
        SNOWY


  }
}
