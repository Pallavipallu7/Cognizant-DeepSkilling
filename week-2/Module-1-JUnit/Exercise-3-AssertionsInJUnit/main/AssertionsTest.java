import org.junit.Test;
import static org.junit.Assert.*;
public class AssertionsTest {
    @Test
    public void testAssertions() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertTrue(5 > 3);
        assertFalse(5 < 3);
        assertNull(null);
        assertNotNull(new Object());
    }
}
