package be.petey952.template;

import java.util.function.Predicate;

public class Util {
    private Util() {
        // Util, no construction
    }

    public static Predicate<String> isPositiveInteger() {
        return s -> {
            try {
                return Integer.parseInt(s) >=0;
            } catch (NumberFormatException e) {
                return false;
            }
        };
    }
}
