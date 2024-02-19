package org.kidoni.sixdegreesbackend;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CreditRepository extends CrudRepository<Credit, Integer> {
    List<Credit> findByTitle(String title);
}
