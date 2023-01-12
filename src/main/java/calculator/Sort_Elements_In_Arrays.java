package calculator;

import java.util.Arrays;
import java.util.Collections;

public class Sort_Elements_In_Arrays {

    public static void main(String[] args) {
        Integer[] array = {4, 1, 5, 3, 2};
        System.out.println("Before sorting: " + Arrays.toString(array));

        for (int i =0; i<array.length-1; i++) {

            for (int j=0; j<array.length-1; j++) {

                if (array[j] > array[j+1] ){

                    int temp=array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("After sorting : " + Arrays.toString(array));
    }
}
        //OR
        // Arrays.sort(array);
        // Arrays.parallelSort(array);
