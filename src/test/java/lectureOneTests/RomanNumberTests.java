package lectureOneTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTests {

    @Test
    void shouldReturnIfor1() {
        assertEquals("I", toRomanNumber(1));
    }

    @Test
    void shouldReturnIIfor2() {
        assertEquals("II", toRomanNumber(2));
    }

    @Test
    void shouldReturnIIIfor3() {
        assertEquals("III", toRomanNumber(3));
    }

    private String toRomanNumber(int n) {
        String result = "I";

        if (n >= 2) {
            result += "I";
        }
        if (n >= 3) {
            result += "I";
        }

        return result;
    }
}
