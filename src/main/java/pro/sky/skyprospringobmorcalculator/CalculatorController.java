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
    public String fivePlusFiveCalculation(@RequestParam(value = "num1", required = false) Integer num1,
                                          @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null) {
            return "U have to enter the data";
        } else if (num2 == null) {
            return "U have to enter the data";
        } else {
            return calculatingService.fivePlusFiveCalculation(num1, num2);
        }
    }

    @GetMapping(path = "/calculator/minus")
    public String fiveMinusFiveCalculation(@RequestParam(value = "num1", required = false) Integer num1,
                                           @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null) {
            return "U have to enter the data";
        } else if (num2 == null) {
            return "U have to enter the data";
        } else {
            return calculatingService.fiveMinusFiveCalculation(num1, num2);
        }
    }

    @GetMapping(path = "/calculator/multiply")
    public String fiveMultiplyFiveCalculation(@RequestParam(value = "num1", required = false) Integer num1,
                                              @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null) {
            return "U have to enter the data";
        } else if (num2 == null) {
            return "U have to enter the data";
        } else {
            return calculatingService.fiveMultiplyFiveCalculation(num1, num2);
        }
    }

    @GetMapping(path = "/calculator/divide")
    public String fiveDivideFiveCalculation(@RequestParam(value = "num1", required = false) Integer num1,
                                            @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null) {
            return "U have to enter the data";
        } else if (num2 == null) {
            return "U have to enter the data";
        } else {
            return calculatingService.fiveDivideFiveCalculation(num1, num2);
        }
    }
}
