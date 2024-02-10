package org.kidoni.sixdegreesbackend;

import lombok.extern.slf4j.Slf4j;
import org.kidoni.sixdegreesbackend.tmdb.TmdbClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequestMapping("/search")
public class SixDegreesSearchController {
    private final TmdbClient client;

    public SixDegreesSearchController(TmdbClient client) {
        this.client = client;
    }

    @GetMapping(path = "/person/{name}", produces = APPLICATION_JSON_VALUE)
    public PersonSearchResult personSearch(@PathVariable String name) {
        final PersonSearchResult searchResult = client.searchByName(name);
        log.debug("found: {}", searchResult);
        return searchResult;
    }
}
