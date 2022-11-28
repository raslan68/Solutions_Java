package find_results;

public class Reverse_Number_String {
    public static void main(String[] args) {

        int num = 123;
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer sbNumber = sb.reverse();
        System.out.println(sbNumber);

        String word = "java";
        StringBuilder stb = new StringBuilder(word);
        StringBuilder stbWord = stb.reverse();
        System.out.println(stbWord);

    }
}
