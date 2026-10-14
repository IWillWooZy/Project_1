import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BracketsTest {

    @Test
    void baseCase() {
        assertEquals(List.of(""), Brackets.generate(0));
        assertEquals(List.of("()"), Brackets.generate(1));
    }

    @Test
    void twoPairs() {
        assertEquals(List.of("(())", "()()"), Brackets.generate(2));
    }

    @Test
    void threePairs() {
        assertEquals(List.of("((()))", "(()())", "(())()", "()(())", "()()()"), Brackets.generate(3));
    }

    @Test
    void countIsCatalanNumber() {
        assertEquals(14, Brackets.generate(4).size());
        assertEquals(42, Brackets.generate(5).size());
    }
}
