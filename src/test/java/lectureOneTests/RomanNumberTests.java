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

    @Test
    void shouldReturnIIIIfor4() {
        assertEquals("IV", toRomanNumber(4));
    }


    private String toRomanNumber(int n) {
        String result = "";

        while (n > 0) {
            result += "I";
            n -= 1;
        }

        return result;
    }
}
