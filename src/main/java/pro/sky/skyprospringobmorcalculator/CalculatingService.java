package pro.sky.skyprospringobmorcalculator;

import org.springframework.stereotype.Service;


@Service
public class CalculatingService {
    public String beginning() {
        return "Hello! Let's calculating!";
    }


    public String fivePlusFiveCalculation(Integer num1, Integer num2) {
        int num3 = num1 + num2;
        return num1 + " + " + num2 + " = " + num3;
    }


    public String fiveMinusFiveCalculation(Integer num1, Integer num2) {
        int num3 = num1 - num2;
        return num1 + " - " + num2 + " = " + num3;
    }


    public String fiveMultiplyFiveCalculation(Integer num1, Integer num2) {
        int num3 = num1 * num2;
        return num1 + " * " + num2 + " = " + num3;
    }


    public String fiveDivideFiveCalculation(Integer num1, Integer num2) {
        if (num2 == 0) {
            return "The divisor must not be zero";
        } else {
            int num3 = num1 / num2;
            return num1 + " / " + num2 + " = " + num3;
        }
    }
}
