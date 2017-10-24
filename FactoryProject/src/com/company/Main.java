package com.company;

import domain.Person;
import factory.DAOFactoryProvider;
import factory.EInstance;

public class Main {
    public static Person person = new Person(); // Temporaly, for tests.
    public static void main(String[] args) {
        DAOFactoryProvider a = DAOFactoryProvider.getInstance();
        a.setSource(EInstance.CSV);
        a.setName("Silva");
        System.out.println(a.getName());
    }
}
