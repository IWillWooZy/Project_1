import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondTaskTest {

    @Test
    void baseCase() {
        assertEquals(1, SecondTask.countDigits(0));
        assertEquals(1, SecondTask.countDigits(7));
        assertEquals(1, SecondTask.countDigits(9));
    }

    @Test
    void recursiveCase() {
        assertEquals(2, SecondTask.countDigits(10));
        assertEquals(3, SecondTask.countDigits(572));
        assertEquals(4, SecondTask.countDigits(1000));
        assertEquals(19, SecondTask.countDigits(Long.MAX_VALUE));
    }

    @Test
    void negativeNumberThrows() {
        assertThrows(IllegalArgumentException.class, () -> SecondTask.countDigits(-5));
    }
}
