package org.kidoni.sixdegreesbackend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RestController
@RequestMapping("/search/person")
public class PersonSearchController {
    private final PersonSearchService personSearchService;

    public PersonSearchController(PersonSearchService personSearchService) {
        this.personSearchService = personSearchService;
    }

    @GetMapping(path = "/{name}", produces = APPLICATION_JSON_VALUE)
    public PersonSearchResult personSearch(@PathVariable String name) {
        final PersonSearchResult searchResult = personSearchService.searchByName(name);
        log.trace("found: {}", searchResult);
        return searchResult;
    }
}
