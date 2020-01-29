package io.github.malast88.actions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void itShouldSum() {
        // arrange
        var calc = new Calculator();

        // act
        int actual = calc.sum(2, 3);

        // assert
        assertEquals(5, actual);
    }
}
