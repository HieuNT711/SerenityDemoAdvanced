package untils;

import dev.codesoapbox.dummy4j.Dummy4j;

public class RandomUtils {
    private RandomUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static String generateRandomEmail() {
        Dummy4j dummy4j = new Dummy4j();
        return new String(dummy4j.name().firstName() + "@gmail.com");
    }
}
