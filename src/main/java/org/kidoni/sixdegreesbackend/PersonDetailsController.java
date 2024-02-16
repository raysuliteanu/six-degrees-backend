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
@RequestMapping("/person")
public class PersonDetailsController {
    private final TmdbClient client;

    public PersonDetailsController(TmdbClient client) {
        this.client = client;
    }

    @GetMapping(path = "/{id}", produces = APPLICATION_JSON_VALUE)
    public Person personSearch(@PathVariable int id) {
        final Person person = client.findPersonById(id);
        log.trace("found: {}", person);
        return person;
    }
}
