package com.example.postgrespractice.dao;

import com.example.postgrespractice.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDAO {

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    int deletePersonByID(UUID id);

    int updatePersonByID(UUID id, Person person);

    Optional<Person> selectPersonById(UUID id);
}
