package Stream_Solutions;

import java.util.List;
import java.util.stream.Collectors;

public class NamesToString {

    public static String namesToString(List<Person> people){
        String label = "Names";
        StringBuilder sb = new StringBuilder(label);
        for (Person person : people){
            if (sb.length() > label.length()){
                sb.append(", ");
            }
          sb.append(person.getName());
        }
        sb.append(".");
        return sb.toString();
    }
        // Stream Solution
    public static String namesToString_Stream1(List<Person> people){
        return "Names" + people.stream().map(Person::getName).reduce((i, sum) -> i + ", " + sum)
                .orElse("")+ ".";
    }

    // OR other solution with stream
    public static String namesToString_Stream2(List<Person> people){
        return "Names" + people.stream().map(Person::getName)
                .collect(Collectors.joining(", ")) + ".";
    }

}
