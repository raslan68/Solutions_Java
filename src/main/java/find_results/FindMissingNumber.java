package find_results;

public class FindMissingNumber {

    public static int missingNumber(int[] nums){
        int sum = 0;
        int n = nums.length;

        for (int num : nums){
            sum += num;
        }
        return n*(n+1) /2 - sum;
    }

    public static void main(String[] args) {
        int[] missingNum = {0,3,2,5,1};
        System.out.println(missingNumber(missingNum));
    }
}
