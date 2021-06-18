package de.deanomus.szut.springboot_crud_service_demo.model;

public class Person {

    private int
            id;

    private String
            firstname,
            surname;

    public Person() {

    }

    public Person(int id, String firstname, String surname) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
    }


    public String toString() {
        return "PERSON, ID: " + this.id + ", Name: " + this.firstname + " " + this.surname;
    }


    public int getId() {
        return id;
    }

    public Person setId(int id) {
        this.id = id;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public Person setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Person setSurname(String surname) {
        this.surname = surname;
        return this;
    }
}
