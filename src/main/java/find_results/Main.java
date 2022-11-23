package find_results;

import calculator.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);

        System.out.println(Find_Total_Number.find_Total_Number(numbers));
        System.out.println(Find_Max_Number.find_Max_Number(numbers));
        Find_Target_Number target_number = new Find_Target_Number(numbers, 1);
        target_number.find_Target_Number();
        Calculator calculator = new Calculator(5, 4);
        System.out.println(calculator.addition());
    }

}
