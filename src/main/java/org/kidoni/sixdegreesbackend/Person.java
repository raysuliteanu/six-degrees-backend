package org.kidoni.sixdegreesbackend;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public record Person(
        @Id
        int id,
        String name,
        float popularity,
        @JsonProperty("known_for")
        @Relationship(type = "ACTED_IN", direction = Relationship.Direction.OUTGOING)
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
