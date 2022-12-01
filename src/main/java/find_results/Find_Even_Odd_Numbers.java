package find_results;

public class Find_Even_Odd_Numbers {

    public static void main(String[] args) {
        int num = 12345;
        int evenCount = 0;
        int oddCount = 0;
        int rev = 0;

        while (num > 0) {
            rev = num % 10; // (num.length - 1) can find last digit of number
            if (rev % 2 == 0) {
                evenCount++;
            } else{
                oddCount++;
        }
            num = num/10;  // 123456  12345  1234  123  12 1
        }
        System.out.println("Even Numbers: " + evenCount);
        System.out.println("Odd Numbers: " + oddCount);
    }

}
