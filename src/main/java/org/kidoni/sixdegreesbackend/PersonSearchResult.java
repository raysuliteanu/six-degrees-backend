package org.kidoni.sixdegreesbackend;

import java.util.List;

public record PersonSearchResult(int page, List<Person> results, int totalPages, int totalResults) {
}
