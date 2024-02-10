package org.kidoni.sixdegreesbackend;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record Person(int id, String name, float popularity, @JsonProperty("known_for") List<Credit> knownFor) {
}
