package org.kidoni.sixdegreesbackend;

import java.util.Date;

public record Credit(int id, String title, String overview, String mediaType, Date releaseDate, float popularity) {
}
