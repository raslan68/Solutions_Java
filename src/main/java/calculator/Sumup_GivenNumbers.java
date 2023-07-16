package calculator;

import java.util.Scanner;

public class Sumup_GivenNumbers {

    public static void main(String[] args) {

        int num ;
        int sum = 0;
        int attempt = 0;

        while(attempt <= 3) {
            System.out.println("Enter your number: ");
            Scanner scan = new Scanner(System.in);
            while (!scan.hasNextInt()){
                System.out.println("Enter only Number please!");
                scan.nextLine();
            }
            num = scan.nextInt();
            if (num !=0) {
                    sum += num;
                    System.out.println("sum: " + sum);
                attempt++;
                }
            }
        System.out.println("TOTAL is: "+ sum);
        if (sum >= 20){
            System.out.println("Congratulations, You win!");
        }else {
            System.out.println("Sorry, You lost.");
        }
    }

}
