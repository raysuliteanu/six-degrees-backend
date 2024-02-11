package org.kidoni.sixdegreesbackend;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public record Credit(int id, String title, String overview, @JsonProperty("media_type") String mediaType,
                     @JsonProperty("release_date") Date releaseDate, float popularity) {
}
