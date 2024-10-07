package com.example.application.views.applayoutheightauto;

import java.util.ArrayList;
import java.util.List;

public class DataService {

    public static List<Person> getPeople(int number) {
        ArrayList<Person> result = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            Person person = new Person();
            person.setFirstName("First " + i);
            person.setLastName("Last " + i);
            result.add(person);
        }

        return result;
    }
}
