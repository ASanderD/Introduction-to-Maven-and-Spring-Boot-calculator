package pro.sky.calculator;

public interface CalculatorService {
    String greeting(); //интерфейс метода приветствия

    String sum(Integer num1, Integer num2);//интерфейс метода сложения
    String minus(Integer num1, Integer num2);//интерфейс метода вычитания
    String multiply(Integer num1, Integer num2);//интерфейс метода умножения
    String divide(Integer num1, Integer num2);//интерфейс метода деления

}
