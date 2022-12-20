package find_results;

public class Find_ifTwoArrays_Equals {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5, 6};
        int[] a2 = {1, 2, 3, 4, 5};

        boolean flag = true;

        if (a1.length == a2.length){
            for (int i=0; i<a1.length; i++){
                if (a1[i] != a2[i]){
                    flag = false;
                }
            }
        }else {
            flag = false;
        }
        if(flag == true){
            System.out.printf("Arrays are equal");
        }else {
            System.out.println("Arrays are NOT equal");
        }

    }

}
