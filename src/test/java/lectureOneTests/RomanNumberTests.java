package lectureOneTests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTests {

    @Test
    void shouldReturnIfor1(){
        assertEquals("I", toRomanNumber(1));
    }

    private String toRomanNumber(int n) {
        String result = "";

        if(n == 1){
            result += "I";
        }
        return null;
    }
}
