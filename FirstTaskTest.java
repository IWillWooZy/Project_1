import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstTaskTest {

    @Test
    void baseCase() {
        assertEquals(5, FirstTask.money(5, 4, 1));
        assertEquals(5, FirstTask.total(5, 4, 1));
        assertEquals(10, FirstTask.total(10, -2, 1));
    }

    @Test
    void moneyOnDayN() {
        assertEquals(9, FirstTask.money(5, 4, 2));
        assertEquals(13, FirstTask.money(5, 4, 3));
        assertEquals(6, FirstTask.money(10, -2, 3));
    }

    @Test
    void totalWithPositiveDifference() {
        assertEquals(27, FirstTask.total(5, 4, 3));
    }

    @Test
    void totalWithNegativeDifference() {
        assertEquals(24, FirstTask.total(10, -2, 3));
    }

    @Test
    void totalWithZeroDifference() {
        assertEquals(50, FirstTask.total(10, 0, 5));
    }

    @Test
    void invalidDayThrows() {
        assertThrows(IllegalArgumentException.class, () -> FirstTask.total(5, 4, 0));
        assertThrows(IllegalArgumentException.class, () -> FirstTask.money(5, 4, -1));
    }
}
