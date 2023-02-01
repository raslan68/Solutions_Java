package Stream_Solutions;

import java.util.List;

public class Calculate {
    public static int calculate(List<Integer> numbers){
        int total = 0;
        for (Integer number : numbers){
            total += number;
        }
        return total;
    }
    //Stream Solution
    public static int calculate_stream(List<Integer> numbers){
        return numbers.stream().reduce((i, sum) -> i + sum)
                .orElse(0);
    }
}
