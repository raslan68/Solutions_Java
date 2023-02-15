package find_results;

import java.util.HashSet;

public class FindMissingNumber {

      public static int missingNumber(int[] nums){
        int sum = 0;
        int n = nums.length;

        for (int num : nums){
            sum += num;
        }
        return n*(n+1) /2 - sum;
    }

   /* public static int missingNumber(int[] nums){
        int n = nums.length;
        HashSet<Integer> hashSet = new HashSet();
        for (int i=0; i <n; i++){
            hashSet.add(nums[i]);
        }
        for (int i=0; i<n; i++){
            if (!hashSet.contains(i)){
                return i;
            }
        }
        return n;
    }*/

    public static void main(String[] args) {
        int[] missingNum = {0,3,2,5,1};
        System.out.println(missingNumber(missingNum));
    }
}
