package se.chasacademy.ahmeteser.fritidslagret.alla_veckor.vecka2.Upgift6_Kravspec_MedlemsRegister;

public class Member {

    private String name;
    private int age;
    private MembershipStatus membershipStatus;


    public Member(String name, int age, MembershipStatus membershipStatus) {
        this.name = name;
        this.membershipStatus = membershipStatus;
        this.age = age;


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MembershipStatus getMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(MembershipStatus membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    @Override
    public String toString() {
        return name + " (" + age + " år) - " + membershipStatus;
    }

}
