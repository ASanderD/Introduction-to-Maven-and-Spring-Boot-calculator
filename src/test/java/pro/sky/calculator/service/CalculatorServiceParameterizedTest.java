package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static pro.sky.calculator.constants.CalculatorServiceTestsConstants.*;

public class CalculatorServiceParameterizedTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();
    @Test
    public void shouldReturnDefaultGreetingsMessage() {
        String result = out.greeting();
        Assertions.assertEquals(GREETING_MESSAGE, result);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectSumResult(Double NUM1,Double NUM2) {
        String result = out.sum(NUM1, NUM2);
        Assertions.assertEquals(createSumMessage(NUM1,NUM2), result);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectMinusResult(Double NUM1,Double NUM2) {
        String result = out.minus(NUM1, NUM2);
        Assertions.assertEquals(createMinusMessage(NUM1,NUM2), result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectMultiplyResult(Double NUM1,Double NUM2) {
        String result = out.multiply(NUM1, NUM2);
        Assertions.assertEquals(createMultiplyMessage(NUM1,NUM2), result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectDivideResult(Double NUM1,Double NUM2) {
        String result = out.divide(NUM1, NUM2);
        Assertions.assertEquals(createDivideMessage(NUM1,NUM2), result);
    }


    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(NUM1,NUM2),
                Arguments.of(NUM3,NUM4)
        );
    }
}
