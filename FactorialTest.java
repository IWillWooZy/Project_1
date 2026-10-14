import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void baseCase() {
        assertEquals(1L, Factorial.factorialLong(0));
        assertEquals(1L, Factorial.factorialLong(1));
        assertEquals(BigInteger.ONE, Factorial.factorialBig(0));
        assertEquals(BigInteger.ONE, Factorial.factorialBig(1));
    }

    @Test
    void recursiveCaseLong() {
        assertEquals(2L, Factorial.factorialLong(2));
        assertEquals(120L, Factorial.factorialLong(5));
        assertEquals(3_628_800L, Factorial.factorialLong(10));
        assertEquals(2_432_902_008_176_640_000L, Factorial.factorialLong(20));
    }

    @Test
    void recursiveCaseBigInteger() {
        assertEquals(BigInteger.valueOf(120), Factorial.factorialBig(5));
        assertEquals(new BigInteger("51090942171709440000"), Factorial.factorialBig(21));
        assertEquals(new BigInteger("30414093201713378043612608166064768844377641568960512000000000000"),
                Factorial.factorialBig(50));
    }

    @Test
    void negativeArgumentThrows() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorialLong(-1));
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorialBig(-1));
    }

    @Test
    void longOverflowStartsAt21() {
        for (int n = 0; n <= 20; n++) {
            assertEquals(Factorial.factorialBig(n), BigInteger.valueOf(Factorial.factorialLong(n)),
                    "Результаты должны совпадать при n = " + n);
        }
        assertNotEquals(Factorial.factorialBig(21), BigInteger.valueOf(Factorial.factorialLong(21)));
        assertEquals(21, Factorial.firstOverflowN());
    }
}
