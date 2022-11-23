package calculator;

public class Calculator {
        int num1, num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int addition(){
            return num1 + num2;
        }
    public int subtraction(){
        return num1 - num2;
    }

    public int multiplication(){
        return num1 * num2;
    }

    public int division(){
        return num1 / num2;
    }
}
