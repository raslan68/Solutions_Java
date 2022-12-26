package find_results;

import java.util.ArrayList;
import java.util.List;

public class Find_Target_Number {

    public  void find_Target_Number(List<Integer> numbers, int target) {
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
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(6);
        list.add(10);
        list.add(5);

        Find_Target_Number dub = new Find_Target_Number();
        dub.find_Target_Number(list, 5);

    }
}
