package se.chasacademy.ahmeteser.fritidslagret.alla_veckor.vecka2.metoder_pssByValue;

public class mainPssByValue {

   void main() {
   // Person person = new Person("Amedo",99);

    //   IO.println(person.age);
     //  IO.println(person.name);

       Person person = Person.createPerson("Ahmedo",99);
       IO.println(person);

       Person.birthday(person);
       IO.println(person.age);
       IO.println(person);
       Person person1 =Person.createPerson("ali",22);
       IO.println(person1);
       Person.birthday(person1);
       IO.println(person1);
//Java skickar en kopia av referensen till `Person`-objektet.
// Kopian pekar på samma objekt som originalet.
// Därför kan `birthday()` ändra `age` i samma objekt,
// även om Java använder pass-by-value.

   }
}
