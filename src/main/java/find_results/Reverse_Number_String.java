package find_results;

public class Reverse_Number_String {
    public static void main(String[] args) {
//----------for Integer-------------------------------
        int num = 123;
        int reverse = 0;
        int lastDigit = 0;

        while (num != 0){
            lastDigit = num % 10;
             reverse = reverse * 10 + lastDigit;
             num = num / 10;
        }
        System.out.println(reverse);

        // OR
       /* StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer sbNumber = sb.reverse();
        System.out.println(sbNumber);*/

//---------------for String-----------------------------
        String str = "java";
        String rev="";

        for (int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
            str.toString();
            //rev= rev + str.toCharArray()[i];  -> also possible
        }
        System.out.println(rev);

    }
}

        //OR
        /*String word = "java";
        StringBuilder stb = new StringBuilder(word);
        StringBuilder stbWord = stb.reverse();
        System.out.println(stbWord);*/