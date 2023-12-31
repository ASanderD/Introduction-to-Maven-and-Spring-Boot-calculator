package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController//аннотация для пометки класса-контроллера
@RequestMapping("/calculator")//аннотация для выноса общей части запросов
public class CalculatorController {
    private final CalculatorServiceImpl calculatorService;//создание переменной типа CalculatorServiceImpl

    public CalculatorController(CalculatorServiceImpl calculatorService) { //конструктор
        this.calculatorService = calculatorService;
    }

    @GetMapping // аннотация для получения запросов типа Get
    public String greeting() { //вызов метода приветствия
        return calculatorService.greeting();
    }

    @GetMapping(path = "/plus")// аннотация для получения запросов типа Get
    public String sum(@RequestParam Integer num1, @RequestParam Integer num2) {//вызов метода сложения
        return calculatorService.sum(num1, num2);
    }

    @GetMapping(path = "/minus")// аннотация для получения запросов типа Get
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2) {//вызов метода вычитания
        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")// аннотация для получения запросов типа Get
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {//вызов метода умножения
        return calculatorService.multiply(num1, num2);
    }
    @GetMapping(path = "/divide")// аннотация для получения запросов типа Get
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {//вызов метода деления
        if (num2 == 0) {
            return "На ноль делить нельзя!";
        } else {
            return calculatorService.divide(num1, num2);
        }
    }
}