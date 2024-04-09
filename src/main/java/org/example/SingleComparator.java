package org.example;

import java.util.Comparator;

public class SingleComparator {
    private Comparator<Person> mycompare;
    public SingleComparator(String type) {
        if(type.equals("FirstName")) {
            this.mycompare=Comparator.comparing(Person::getFirstName);
        } else if (type.equals("LastName")) {
            this.mycompare=Comparator.comparing(Person::getLastName);
        } else {
            this.mycompare=Comparator.comparing(Person::getAge);
        }
    }

    public Comparator<Person> getMycompare() {
        return mycompare;
    }
}
