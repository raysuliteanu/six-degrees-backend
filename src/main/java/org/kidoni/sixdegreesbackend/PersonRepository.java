package org.kidoni.sixdegreesbackend;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Integer> {
    List<Person> findPersonByAdultTrue();

}
