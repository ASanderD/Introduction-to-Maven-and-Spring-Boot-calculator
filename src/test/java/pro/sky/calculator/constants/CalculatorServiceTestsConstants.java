package pro.sky.calculator.constants;

import java.util.Random;

public class CalculatorServiceTestsConstants {
    static Random r = new Random();
    public static final double NUM1 = r.nextDouble(-100,100);
    public static final double NUM2 = r.nextDouble(-100,100);
    public static final double NUM3 =  r.nextDouble(-100,100);
    public static final double NUM4 =  r.nextDouble(-100,100);
    public static final double NUM_ZERO = 0;
    public static final String GREETING_MESSAGE = "Добро пожаловать в калькулятор!";

    public static String createSumMessage(Double NUM1, Double NUM2) {
        return NUM1 + " + " + NUM2 + " = " + (NUM1 + NUM2);
    }
    public static String createMinusMessage(Double NUM1, Double NUM2) {
        return NUM1 + " - " + NUM2 + " = " + (NUM1 - NUM2);
    }
    public static String createMultiplyMessage(Double NUM1, Double NUM2) {
        return NUM1 + " * " + NUM2 + " = " + (NUM1 * NUM2);
    }
    public static String createDivideMessage(Double NUM1, Double NUM2) {
        return NUM1 + " / " + NUM2 + " = " + (NUM1 / NUM2);
    }
}
