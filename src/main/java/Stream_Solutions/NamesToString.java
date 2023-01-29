package Stream_Solutions;

import java.util.List;

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
    public static String namesToString_Stream(List<Person> people){
        return "Names" + people.stream().map(person -> person.getName()).reduce((i, sum) -> i + "," + sum)
                .orElse("")+ ".";
    }

}
