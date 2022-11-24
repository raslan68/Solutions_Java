package find_results;

import java.util.Collections;
import java.util.List;

public class Find_Max_Number {

    public static String find_Max_Number(List<Integer> nums){
        int max = 0;
        for (Integer num : nums){
            if (num > max){
                max=num;
            }
        }
        return "Max number is: " + max;

    }
}
        //OR
        // return  Collections.max(nums).toString();