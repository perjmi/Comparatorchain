package org.example;

public class Person {
    private String FirstName;
    private String LastName;
    private int age;

    public Person(String firstname, String lastname, int age) {
        this.FirstName=firstname;
        this.LastName=lastname;
        this.age=age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return age;
    }
}
