package org.kidoni.sixdegreesbackend;

import org.kidoni.sixdegreesbackend.tmdb.TmdbClient;
import org.springframework.stereotype.Service;

@Service
public class PersonSearchService {
    private final TmdbClient client;
    private final PersonRepository personRepository;

    public PersonSearchService(TmdbClient client, PersonRepository personRepository) {
        this.client = client;
        this.personRepository = personRepository;
    }

    public PersonSearchResult searchByName(String name) {
        PersonSearchResult searchResult = client.searchByName(name);

        personRepository.saveAll(searchResult.results());

        return searchResult;
    }
}
