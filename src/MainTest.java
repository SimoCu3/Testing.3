import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();

    @Test
    void dateLong() {
        String result = testing.dateLong("2023-03-01T13:00:00Z");
        assertEquals("1 marzo 2023","1 marzo 2023");
    }

    @Test
    void dateFull() {
        String result = testing.dateFull("2023-03-01T13:00:00Z");
        assertEquals("mercoledì 1 marzo 2023","mercoledì 1 marzo 2023");
    }
}
