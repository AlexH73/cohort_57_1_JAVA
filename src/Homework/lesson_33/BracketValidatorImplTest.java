package Homework.lesson_33;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class BracketValidatorImplTest {

    private final BracketValidator validator = new BracketValidatorImpl();

    @Test
    public void testIsValidBracketSequence() {
        assertTrue(validator.isValidBracketSequence("( [ ] { } )"));
        assertFalse(validator.isValidBracketSequence("[(])"));
        assertTrue(validator.isValidBracketSequence("{[( )]}"));
        assertFalse(validator.isValidBracketSequence("{[}"));
    }

    @Test
    public void testGetInvalidBracketIndexes() {
        assertEquals(List.of(), validator.getInvalidBracketIndexes("( [ ] { } )"));
        assertEquals(List.of(2, 3), validator.getInvalidBracketIndexes("[(])"));
        assertEquals(List.of(2), validator.getInvalidBracketIndexes("{[}"));
    }

    @Test
    public void testFixBracketSequence() {
        assertEquals("( [ ] { } )", validator.fixBracketSequence("( [ ] { } )"));
        assertEquals("[()]", validator.fixBracketSequence("[(])")); // Nicht korrigierbar
        assertEquals("{[()]}", validator.fixBracketSequence("{[( )]}"));
        assertEquals("{[]}", validator.fixBracketSequence("{]"));
    }
}
