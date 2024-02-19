package org.kidoni.sixdegreesbackend;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.Date;
import java.util.List;

@Node
public record Credit(
        @Id
        int id,
        String title,
        String overview,
        @JsonProperty("media_type")
        String mediaType,
        @JsonProperty("release_date")
        Date releaseDate,
        float popularity,
        boolean adult,
        @JsonProperty("genre_ids")
        List<Integer> genreIds,
        boolean video,
        @JsonProperty("original_language")
        String originalLanguage,
        @JsonProperty("original_title")
        String originalTitle,
        @JsonProperty("poster_path")
        String posterPath,
        @JsonProperty("backdrop_path")
        String backdropPath
) {
}
