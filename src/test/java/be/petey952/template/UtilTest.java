package be.petey952.template;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @ParameterizedTest
    @MethodSource("positiveNumbers")
    void isInteger_yesItIs(String s, boolean expected) {
        assertEquals(expected, Util.isPositiveInteger().test(s));
    }

    @ParameterizedTest
    @MethodSource("notPositiveNumbers")
    void isInteger_NoItAint(String s, boolean expected) {
        assertEquals(expected, Util.isPositiveInteger().test(s));
    }

    private static Stream<Arguments> positiveNumbers() {
        return Stream.of(
                Arguments.of("1", true),
                Arguments.of("001", true),
                Arguments.of("10", true),
                Arguments.of("5", true),
                Arguments.of("900", true),
                Arguments.of("00300", true),
                Arguments.of("0", true)
        );
    }

    private static Stream<Arguments> notPositiveNumbers() {
        return Stream.of(
                Arguments.of("-1", false),
                Arguments.of("0x1", false),
                Arguments.of("a", false),
                Arguments.of("5a", false),
                Arguments.of("a900", false),
                Arguments.of("300.0", false),
                Arguments.of("0.1", false)
        );
    }
}