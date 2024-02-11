package org.kidoni.sixdegreesbackend.tmdb;

import lombok.extern.slf4j.Slf4j;
import org.kidoni.sixdegreesbackend.PersonSearchResult;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;

@Slf4j
public class TmdbClient {
    public static final String SEARCH_PERSON_PATH = "/search/person";
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
                .httpRequest(clientHttpRequest -> {
                    log.debug("URI: {} Authorization: {}",
                            clientHttpRequest.getURI().toASCIIString(),
                            clientHttpRequest.getHeaders().get(HttpHeaders.AUTHORIZATION));

                })
                .retrieve()
                .body(PersonSearchResult.class);
    }
}
