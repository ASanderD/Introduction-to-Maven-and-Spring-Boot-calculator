package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.calculator.constants.CalculatorServiceTestsConstants.*;

class CalculatorServiceTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturnDefaultGreetingsMessage() {
        String result = out.greeting();
        Assertions.assertEquals(GREETING_MESSAGE, result);
    }

    @Test
    public void shouldReturnCorrectSumResult() {
        String result = out.sum(NUM1, NUM2);
        String result2 = out.sum(NUM3, NUM4);
        Assertions.assertEquals(createSumMessage(NUM1, NUM2), result);
        Assertions.assertEquals(createSumMessage(NUM3, NUM4), result2);
    }

    @Test
    public void shouldReturnCorrectMinusResult() {
        String result = out.minus(NUM1, NUM2);
        String result2 = out.minus(NUM3, NUM4);
        Assertions.assertEquals(createMinusMessage(NUM1,NUM2), result);
        Assertions.assertEquals(createMinusMessage(NUM3,NUM4), result2);
    }

    @Test
    public void shouldReturnCorrectMultiplyResult() {
        String result = out.multiply(NUM1, NUM2);
        String result2 = out.multiply(NUM3, NUM4);
        Assertions.assertEquals(createMultiplyMessage(NUM1,NUM2), result);
        Assertions.assertEquals(createMultiplyMessage(NUM3,NUM4), result2);
    }

    @Test
    public void shouldReturnCorrectDivideResult() {
        String result = out.divide(NUM1, NUM2);
        String result2 = out.divide(NUM3, NUM4);
        Assertions.assertEquals(createDivideMessage(NUM1,NUM2), result);
        Assertions.assertEquals(createDivideMessage(NUM3,NUM4), result2);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionInDivideMethodWhenNum_0() {
        assertThrows(IllegalArgumentException.class,
                () -> out.divide(NUM3, NUM_ZERO)
        );
    }
}