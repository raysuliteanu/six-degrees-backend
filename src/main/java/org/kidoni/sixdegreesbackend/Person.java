package org.kidoni.sixdegreesbackend;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record Person(
        int id,
        String name,
        float popularity,
        @JsonProperty("known_for")
        List<Credit> knownFor,
        boolean adult,
        @JsonProperty("also_known_as")
        List<String> alsoKnownAs,
        String biography,
        String birthday,
        String deathday,
        @JsonProperty("gender")
        int genderCode,
        String homepage,
        @JsonProperty("imdb_id")
        String imdbId,
        @JsonProperty("known_for_department")
        String knownForType,
        @JsonProperty("place_of_birth")
        String placeOfBirth,
        @JsonProperty("profile_path")
        String profilePath
) {
}
