package find_results;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Find_Max_Number {

    public static String find_Max_Number(List<Integer> nums){
        int max = 0;
        for (int i=1; i<nums.size(); i++){
            if (nums.get(i) > max){
                max=nums.get(i);
            }
        }
        return "Max number is: " + max;

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(4);
        list.add(10);
        list.add(2);
        System.out.println(find_Max_Number(list));
    }
}
        //OR
        // return  Collections.max(nums).toString();