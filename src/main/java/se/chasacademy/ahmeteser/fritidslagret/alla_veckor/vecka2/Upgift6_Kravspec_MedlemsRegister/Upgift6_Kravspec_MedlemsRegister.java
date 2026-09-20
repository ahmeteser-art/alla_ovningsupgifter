package se.chasacademy.ahmeteser.fritidslagret.alla_veckor.vecka2.Upgift6_Kravspec_MedlemsRegister;

public class Upgift6_Kravspec_MedlemsRegister {

    void main() {
        Member[] members = new Member[5];//5 stycken en array
        // TODO: Skapa members

        members[0] = new Member("David", 33, MembershipStatus.ACTIVE);
        members[2] = new Member("Anna", 28, MembershipStatus.PAUSED);
        members[3] = new Member("Kim", 45, MembershipStatus.TERMINATED);

        runMenuLoop(members);//DRY Prensib (Don't Repeat Yourself)
    }

    void runMenuLoop(Member[] members) {
        while (true) {
            IO.println("""
                    1. Visa medlemmar
                    2. Byt medlemsstatus
                    3. Avsluta""");
            int choiceMeny = Integer.parseInt(IO.readln("> "));
            switch (choiceMeny) {
                case 1 -> {
                    // TODO: Visa medlemmar
                    showMembers(members);
                /*IO.println("Medlemmar");

                for (int i = 0; i < members.length; i++) {
                    if (members[i]!= null){
                        IO.println(i + " : " + members[i]);
                    }
                }*/
                }
                case 2 -> {
                    // TODO: Byt medlemsstatus

                    changeMembershipStatus(members);
    /*
                int index   = Integer.parseInt(IO.readln("Välj medlem: "));

                if (index >= 0 && index < members.length && members[index] != null) {

                    IO.println("""
                            Ny status:
                            1. ACTIVE
                            2. PAUSED
                            3. TERMINATED
                            """);

                    int statusChoice = Integer.parseInt(IO.readln("> "));

                    switch (statusChoice) {
                        case 1 -> members[index].setMembershipStatus(MembershipStatus.ACTIVE);
                        case 2 -> members[index].setMembershipStatus(MembershipStatus.PAUSED);
                        case 3 -> members[index].setMembershipStatus(MembershipStatus.TERMINATED);
                }
            }
       */
                }
                case 3 -> {
                    return;
                }
            }
        }

    }

    void showMembers(Member[] members) {
        IO.println("Medlemmar:");
        for (int i = 0; i < members.length; i++) {
            Member member = members[i];
            if (member != null) { // 0-2-3 print bara 1-4 null print inte
                IO.println(String.format("%d: %s", i, member));
            }
        }
    }

    void changeMembershipStatus(Member[] members) {
        int memberIndex = Integer.parseInt(IO.readln("Välj medlem: "));

        // 1. Guard Clause: boundry check
        if (memberIndex < 0 || memberIndex >= members.length) {
            IO.println("invalid index! choose one number between 1 and " + members.length);
            return;
        }

        // 2. Guard Clause: Null check
        if (members[memberIndex] == null) {
            IO.println("No medlem found in index! " + memberIndex);
            return;
        }

// first boundry check bcs && and operator read left side
        if (memberIndex >= 0 && memberIndex < members.length && members[memberIndex] != null) {
            IO.println("""
                    Ny status:
                    1. ACTIVE
                    2. PAUSED
                    3. TERMINATED""");
            int choice = Integer.parseInt(IO.readln("> "));
            switch (choice) {
                case 1 -> {
                    members[memberIndex].setMembershipStatus(MembershipStatus.ACTIVE);
                }
                case 2 -> {
                    members[memberIndex].setMembershipStatus(MembershipStatus.PAUSED);
                }
                case 3 -> {
                    members[memberIndex].setMembershipStatus(MembershipStatus.TERMINATED);
                }
            }//members[1].setMembershipStatus(...) == null NullPointerException
            //cannot invoke 1-validation check -> 1 index of array null empty or what?
            //if (members[memberIndex] == null) {
            //    IO.println("error: it has not member in this index!");
            //    return; // eller fråga med while -loop igen
            //}
            // 2- look through the boundary check
            //if user input -1 BOM! user input enter 5 or 99 BOm!(ArrayIndexOutOfBoundsException)
            // boundary check: cannot be null  AND  cannot be more then index  OR index.length
            //if (memberIndex < 0 || memberIndex >= members.length) {
            //    IO.println("Error: invalid index! 0 AND " + (members.length - 1) + between one number
            //    return;
            //}
        }
    }
/*
1. Visa medlemmar
2. Byt medlemsstatus
3. Avsluta
_____________________________________
____________________________________
Medlemmar:
0: David (33 år) - ACTIVE
2: Anna (28 år) - PAUSED
3: Kim (45 år) - TERMINATED

_________________________________
___________________________________
Välj medlem: 0
Ny status:
1. ACTIVE
2. PAUSED
3. TERMINATED
>
____________________________________
___________________________________
 */
    /*
    Uppgift 6: Medlemsregister
Skapa ett litet medlemsregister för en förening.

Börja med att klona grundprojektet från GitHub, och använd det som utgångspunkt:
https://github.com/davidcederlund-chas/week2_task6 to an external site. to an external site.

Kravspecifikation
MembershipStatus
Fyll i Enum MembershipStatus med värdena

ACTIVE
PAUSED
TERMINATED
Member
Fyll i Klass Member

Fält för namn, ålder och medlemsstatus
Parameteriserad konstruktor
getters
setters
toString()
exempelutskrift: David (33 år) - ACTIVE
Mainmetod
Skapa en array som kan innehålla fem medlemmar.

Skapa tre Member-objekt och placera dem i arrayen på position 0, 2 och 3.

Observera: Vi lämnar några platser tomma så att arrayen innehåller både objekt och null.

Implementera funktionerina 1 och 2 i en menyloop som visas tills användaren väljer att avsluta programmet.

1. Visa medlemmar
2. Byt medlemsstatus
3. Avsluta
Visa medlemmar
Skriv ut alla medlemmar i arrayen, med dess index.
Kontrollera att elementet inte är null innan det används, skriv inte ut null.
Använd toString() när medlemmarna skrivs ut.

Exempel:

Medlemmar:
0: David (33 år) - ACTIVE
2: Anna (28 år) - PAUSED
3: Kim (45 år) - TERMINATED
Byt medlemsstatus
Låt användaren välja vilken medlem som ska ändras, enligt dess index i arrayen (Siffran innan kolon i Visa medlemmar).
Låt sedan användaren välja en ny medlemsstatus och uppdatera objektet.

Exempel:

Välj medlem: 0
Ny status:
1. ACTIVE
2. PAUSED
3. TERMINATED
>
     */
}
