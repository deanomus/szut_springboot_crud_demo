package de.deanomus.szut.springboot_crud_service_demo.model;

public class Person {

    private int
            id;

    private String
            firstname,
            surname;

    public Person(int id, String firstname, String surname) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
    }


    public String toString() {
        return "PERSON, ID: " + this.id + ", Name: " + this.firstname + " " + this.surname;
    }

}
