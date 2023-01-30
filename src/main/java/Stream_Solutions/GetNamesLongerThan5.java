package Stream_Solutions;

import java.util.Arrays;

public class GetNamesLongerThan5 {

    public  static int getNamesLongerThan5(String... names){
        return Arrays.stream(names).filter(name -> name.length() > 5)
                .mapToInt(name -> name.length())
                .sum();
    }
}
