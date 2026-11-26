package se.chasacademy.ahmeteser.fritidslagret.practice;

public enum Day {// data type t.ex int.string,double,boolean, Monday

    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String displayName;
    private

    Day(String displayName) {
        this.displayName = displayName;
    }
    @Override
    public String toString() {
        return displayName;
    }
}
