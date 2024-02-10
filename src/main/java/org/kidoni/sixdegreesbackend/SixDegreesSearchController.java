package org.kidoni.sixdegreesbackend;

import org.kidoni.sixdegreesbackend.tmdb.TmdbClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SixDegreesSearchController {
    private final TmdbClient client;

    public SixDegreesSearchController(TmdbClient client) {
        this.client = client;
    }

    @GetMapping(path = "/person/{name}")
    public PersonSearchResult personSearch(@PathVariable String name) {
        return client.searchByName(name);
    }
}
