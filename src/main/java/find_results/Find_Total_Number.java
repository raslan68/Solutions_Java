package find_results;

import java.util.List;

public class Find_Total_Number {
    public static String find_Total_Number(List<Integer> nums){
        int total = 0;

        for (Integer num : nums){
            total+=num;
        }
        return "Total Number is: " + total;
    }

}
