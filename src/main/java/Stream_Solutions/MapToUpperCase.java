package Stream_Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class MapToUpperCase {

    public static Collection<String> mapToUpperCase(String... names){
            Collection<String> upperCaseNames = new ArrayList<>();
            for (String name : names){
                upperCaseNames.add(name.toUpperCase());
            }
            return upperCaseNames;
    }
    // Stream Solution
    public static Collection<String> mapToUpperCase_Stream(String... names){

        return Arrays.stream(names).map(i -> i.toUpperCase()).collect(Collectors.toList());
    }

}
