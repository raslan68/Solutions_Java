package Stream_Solutions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnderAge {
    public static Set<String> getKidsName(List<Person> people){
        Set<String> kids = new HashSet<>();
        for (Person person : people){
            if (person.getAge() < 18){
                kids.add(person.getName());
            }
        }
        return kids;
    }
    // Stream Solution
    public static Set<String> getKidsName_stream(List<Person> people) {
        return people.stream()
                .filter(person -> person.getAge() < 18)
                .map(Person::getName)
                .collect(Collectors.toSet());
    }
}
