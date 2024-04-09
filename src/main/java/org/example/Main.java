package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<Person> a = new ArrayList<>();
        SingleComparator mycompare = new SingleComparator("FirstName");

        a.add(new Person("Sophia","Jensen",14));
        a.add(new Person("Amalie","Jensen",21));
        a.sort(mycompare.getMycompare());

        for( Person person : a) {
            System.out.println(person.getFirstName());
        }

    }
}