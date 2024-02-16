package org.kidoni.sixdegreesbackend.tmdb;

import lombok.extern.slf4j.Slf4j;
import org.kidoni.sixdegreesbackend.Person;
import org.kidoni.sixdegreesbackend.PersonSearchResult;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;

@Slf4j
public class TmdbClient {
    public static final String SEARCH_PERSON_PATH = "/search/person";
    public static final String PERSON_DETAIL_PATH = "/person/";
    private final RestClient restClient;

    public TmdbClient(RestClient restClient) {
        this.restClient = restClient;
    }

    public PersonSearchResult searchByName(String name) {
        log.debug("searching for {}", name);
        return restClient.method(HttpMethod.GET)
                .uri((uriBuilder -> uriBuilder
                        .path(SEARCH_PERSON_PATH)
                        .queryParam("query", name)
                        .build()))
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .body(PersonSearchResult.class);
    }

    public Person findPersonById(int id) {
        return restClient.method(HttpMethod.GET)
                .uri(PERSON_DETAIL_PATH + id)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .body(Person.class);
    }
}
