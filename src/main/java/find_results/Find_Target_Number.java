package find_results;

import java.util.List;

public class Find_Target_Number {

    List<Integer> numbers;
    int target;

    public Find_Target_Number(List<Integer> numbers, int target) {
        this.numbers = numbers;
        this.target = target;
    }

    public  void find_Target_Number() {
        boolean correct = false;

        for (int num : numbers) {
            if (target == num) {
                correct = true;

            }
        }
        if (correct) {
            giveMesaj("Target Number " +target+" is found");
        } else {
            giveMesaj("Sorry, Target number "+ target+" is NOT found");
        }

    }
    public static void giveMesaj(String mesaj){
        System.out.println(mesaj);

    }
}
