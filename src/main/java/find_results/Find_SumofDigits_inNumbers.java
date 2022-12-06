package find_results;

public class Find_SumofDigits_inNumbers {

    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        int rev = 0;

            while (num > 0) {

                rev = num % 10;
                sum += rev;
                num = num / 10;
            }
        System.out.println(sum);;
        }

}
