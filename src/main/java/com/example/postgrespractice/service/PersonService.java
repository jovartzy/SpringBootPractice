package com.example.postgrespractice.service;

import com.example.postgrespractice.dao.PersonDAO;
import com.example.postgrespractice.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonDAO personDAO;

    @Autowired
    public PersonService(@Qualifier("fakeDAO") PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public int addPerson(Person person) {
        return personDAO.insertPerson(person);
    }

    public List<Person> getAllPeople() {
        return personDAO.selectAllPeople();
    }

    public Optional<Person> getPersonByID(UUID id) {
        return personDAO.selectPersonById(id);
    }

    public int deletePerson(UUID id) {
        return personDAO.deletePersonByID(id);
    }

    public int updatePerson(UUID id, Person person) {
        return personDAO.updatePersonByID(id, person);
    }
}
