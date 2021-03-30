package org.mvc.dao;

import org.mvc.entity.PeopleEntity;

import java.util.List;

public interface PeopleDAO {
    List<PeopleEntity> getAllPeople();

    void savePerson(PeopleEntity person);

    PeopleEntity getPerson(int peopleId);

    void deletePerson(int personId);
}
