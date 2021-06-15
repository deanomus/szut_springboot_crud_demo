package de.deanomus.szut.springboot_crud_service_demo.dao;

import de.deanomus.szut.springboot_crud_service_demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class PersonDao {

    private HashMap<Integer, Person> personList;

    public PersonDao() {
        personList = new HashMap<Integer, Person>();

        initHashMap();
    }

    public void initHashMap() {
        personList.put(0, new Person(0, "Max", "Mustermann"));
        personList.put(1, new Person(1, "Rainer", "Zufall"));
        personList.put(2, new Person(2, "Dean", "Reinhardt"));
        personList.put(3, new Person(3, "Mercedes", "AMG"));
        personList.put(4, new Person(4, "Bernd", "Heidemann"));
        personList.put(4, new Person(4, "Dilara", "Doener"));
    }

    public Person create(Person person) {
        return person;
    }

    public Person read(int id) {
        return null;
    }

    public List<Person> read() {
        List<Person> list = new ArrayList<Person>(personList.values());
        return list;
    }

    public Person update(Person person) {
        return person;
    }

    public void delete(int id) {

    }
}
