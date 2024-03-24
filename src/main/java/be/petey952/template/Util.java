package be.petey952.template;

import java.util.function.Predicate;

public final class Util {
    private Util() {
        // Util, no construction
    }

    /**
     * Returns a {@code Predicate<String>} that tests if a given string represents a positive integer (including zero).
     * The predicate returns {@code true} if the input string is a valid representation of a non-negative integer,
     * and {@code false} otherwise. This includes catching and handling {@code NumberFormatException} for strings
     * that cannot be parsed into an integer.
     * 
     * <p>Examples of input and output:</p>
     * <ul>
     *     <li>Input: "123" -> Output: {@code true}</li>
     *     <li>Input: "-123" -> Output: {@code false}</li>
     *     <li>Input: "abc" -> Output: {@code false}</li>
     *     <li>Input: "0" -> Output: {@code true}</li>
     * </ul>
     *
     * @return A {@code Predicate<String>} that tests whether a string is a representation of a non-negative integer.
     */
    public static Predicate<String> isPositiveInteger() {
        return s -> {
            try {
                return Integer.parseInt(s) >= 0;
            } catch (NumberFormatException e) {
                return false;
            }
        };
    }
}
