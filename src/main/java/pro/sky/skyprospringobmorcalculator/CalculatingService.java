package pro.sky.skyprospringobmorcalculator;

import org.springframework.stereotype.Service;


@Service
public class CalculatingService {
    public String beginning() {
        return "Hello! Let's calculating!";
    }


    public String fivePlusFiveCalculation(int num1, int num2) {
        int num3 = num1 + num2;
        return num1 + " + " + num2 + " = " + num3;
    }


    public String fiveMinusFiveCalculation(int num1, int num2) {
        int num3 = num1 - num2;
        return num1 + " + " + num2 + " = " + num3;
    }


    public String fiveMultiplyFiveCalculation(int num1, int num2) {
        int num3 = num1 * num2;
        return num1 + " + " + num2 + " = " + num3;
    }


    public String fiveDivideFiveCalculation(int num1, int num2) {
        int num3 = num1 / num2;
        return num1 + " + " + num2 + " = " + num3;
    }
}
