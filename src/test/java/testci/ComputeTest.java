package testci;

import static org.junit.jupiter.api.Assertions.*;

class ComputeTest {
    Compute compute = new Compute();

    @org.junit.jupiter.api.Test
    void plus() {
        assertEquals(4, compute.plus(2, 2));
        assertEquals(2, compute.plus(2, 0));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        assertEquals(4, compute.subtract(4, 0));
        assertEquals(1, compute.subtract(2, 1));
    }

    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals(2, compute.divide(4, 2));
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            compute.divide(1, 0);
        });
        String expectedMessage = "b must not be zero";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}