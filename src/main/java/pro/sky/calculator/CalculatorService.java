package pro.sky.calculator;

public interface CalculatorService {
    String greeting(); //интерфейс метода приветствия

    String sum(int num1, int num2);//интерфейс метода сложения
    String minus(int num1, int num2);//интерфейс метода вычитания
    String multiply(int num1, int num2);//интерфейс метода умножения
    String divide(int num1, int num2);//интерфейс метода деления

}
