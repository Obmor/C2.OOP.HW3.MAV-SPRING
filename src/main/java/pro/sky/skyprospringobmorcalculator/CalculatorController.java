package pro.sky.skyprospringobmorcalculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorController {

    private final CalculatingService calculatingService;

    public CalculatorController(CalculatingService calculatingService) {
        this.calculatingService = calculatingService;
    }

    @GetMapping(path = "/calculator")
    public String beginning() {
        return calculatingService.beginning();
    }

    @GetMapping(path = "/calculator/plus")
    public String fivePlusFiveCalculation(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatingService.fivePlusFiveCalculation(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String fiveMinusFiveCalculation(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatingService.fiveMinusFiveCalculation(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String fiveMultiplyFiveCalculation(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatingService.fiveMultiplyFiveCalculation(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String fiveDivideFiveCalculation(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatingService.fiveDivideFiveCalculation(num1, num2);
    }
}
