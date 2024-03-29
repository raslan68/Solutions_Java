package Stream_Solutions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Transform {

    public static List<String> transform(List<List<String>> collection){
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection){
            for (String value : subCollection){
                newCollection.add(value);
            }
        }
        return newCollection;
    }
    //Stream Solution
    public static List<String> transform_stream(List<List<String>> collection){

        return collection.stream().flatMap(Collection::stream)
                .collect(Collectors.toList());
    }


}
