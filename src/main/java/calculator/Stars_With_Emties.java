package calculator;

public class Stars_With_Emties {

    public static void main(String[] args) {

        int n = 5;

        for (int i=1; i<n; i++){
            boolean flag= true;

            for (int j=1; j<=i; j++){
                if (flag){
                for (int k = 1; k <= (2 * n - 2 * i); k++) {
                    System.out.print(" ");
                }
                }
                flag=false;
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
