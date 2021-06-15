package de.deanomus.szut.springboot_crud_service_demo.controller;

import de.deanomus.szut.springboot_crud_service_demo.dao.PersonDao;
import de.deanomus.szut.springboot_crud_service_demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonDao personDao;


    @GetMapping(
            value = "/SpringBootCrudService/person",
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public @ResponseBody ResponseEntity<Person> getPersonByParam(@RequestParam("id") int id) {
        Person personRead = personDao.read(id);

        if (personRead == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(personRead);
        }
    }


    @GetMapping(
            value = "/SpringBootCrudService/person/{id}",
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public @ResponseBody ResponseEntity<Person> getPersonByUrl(@RequestParam("id") int id) {
        Person personRead = personDao.read(id);

        if (personRead == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(personRead);
        }
    }

    @GetMapping(
            value = "/SpringBootCrudService/allpersons",
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public @ResponseBody ResponseEntity<List<Person>> getAllPersons(@RequestParam("id") int id) {
        List<Person> personListRead = personDao.read();

        if (personListRead == null && false) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(personListRead);
        }
    }


    @PostMapping(
            value = "/SpringBootCrudService/addperson",
            consumes = { MediaType.APPLICATION_JSON_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public @ResponseBody ResponseEntity<Person> addPerson(@RequestBody Person person) {
        Person addPerson = personDao.create(person);

        if (addPerson == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(addPerson);
        }
    }

    @PostMapping(
            value = "/SpringBootCrudService/updateperson",
            consumes = { MediaType.APPLICATION_JSON_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public @ResponseBody ResponseEntity<Person> updatePerson(@RequestBody Person person) {
        Person updatePerson = personDao.update(person);

        if (updatePerson == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(updatePerson);
        }
    }



    @PostMapping(
            value = "/SpringBootCrudService/deleteperson/{id}",
            consumes = { MediaType.APPLICATION_JSON_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public @ResponseBody ResponseEntity<String> deletePersonByUrl(@RequestBody int id) {
        personDao.delete(id);

        return ResponseEntity.ok("success");
    }


    @PostMapping(
            value = "/SpringBootCrudService/deleteperson",
            consumes = { MediaType.APPLICATION_JSON_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public @ResponseBody ResponseEntity<String> deletePersonByParam(@RequestBody int id) {
        personDao.delete(id);

        return ResponseEntity.ok("success");
    }


    @GetMapping(
            value = "/SpringBootCrudService/welcome",
            produces = { MediaType.APPLICATION_JSON_VALUE }
    )
    public @ResponseBody ResponseEntity<String> getWelcomeMessage() {
        return ResponseEntity.ok("Dies ist ein Schulprojekt des Schulzentrums Utbremen");
    }

}
