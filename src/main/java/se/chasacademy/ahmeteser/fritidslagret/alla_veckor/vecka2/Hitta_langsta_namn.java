package se.chasacademy.ahmeteser.fritidslagret.alla_veckor.vecka2;

public class Hitta_langsta_namn {
    /*
    Uppgift 2: Hitta det längsta namnet
    Skapa en array med minst fem namn.

    Använd en for-loop för att hitta det längsta namnet i arrayen.

    Skriv sedan ut namnet enligt exempelutskriften nedan.

    Exempelutskrift:

    Det längsta namnet är Alexander
     */
    void main() {
        String name[] = new String[5];

        name[0] = "Zera";
        name[1] = "Zita";
        name[2] = "Amedo";
        name[3] = "Nea";
        name[4] = "Alexander";

        String longestName= "";

        for (String langsta : name) {
            if (langsta.length()>longestName.length()){
                longestName=langsta;
            }
        }
        IO.println("longest name in this fixed 5 sized array is "+longestName);

    }
}
