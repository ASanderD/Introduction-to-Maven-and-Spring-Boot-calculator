package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String greeting() {//реализация (переопределение) метода приветствия
        return "Добро пожаловать в калькулятор!";
    }
    @Override
    public String sum(int num1, int num2) {//реализация (переопределение) метода сложения
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(int num1, int num2) {//реализация (переопределение) метода вычитания
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }
    @Override
    public String multiply(int num1, int num2) {//реализация (переопределение) метода умножения
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }
    @Override
    public String divide(int num1, int num2) {//реализация (переопределение) метода деления
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
