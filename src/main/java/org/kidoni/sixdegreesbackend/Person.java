package org.kidoni.sixdegreesbackend;

import java.util.List;

public record Person(int id, String name, float popularity, List<Credit> knownFor) {
}
