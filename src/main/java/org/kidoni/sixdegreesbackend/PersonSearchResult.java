package org.kidoni.sixdegreesbackend;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PersonSearchResult(int page, List<Person> results, @JsonProperty("total_pages") int totalPages, @JsonProperty("total_results") int totalResults) {
}
