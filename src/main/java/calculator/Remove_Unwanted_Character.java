package calculator;

public class Remove_Unwanted_Character {

    public static void main(String[] args) {
        String st = "$*/#+ Hello #+$§? Java-#$%&?";

        st = st.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(st);

    }
}
