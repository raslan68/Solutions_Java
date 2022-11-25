package calculator;

import java.util.Scanner;

public class Sumup_GivenNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.println("Enter your number: ");

        while ((num = scan.nextInt()) != 0) {
            sum += num;
            System.out.println("Total is :" + sum);
        }
    }
}
