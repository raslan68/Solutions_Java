package Stream_Solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByNationalit {

        public static Map<String, List<Person>> groupByNationality (List < Person > people) {
            Map<String, List<Person>> map = new HashMap<>();
            for (Person person : people) {
                if (!map.containsKey(person.getNationality())) {
                    map.put(person.getNationality(), new ArrayList<>());
                }
                map.get(person.getNationality()).add(person);
            }
            return map;
        }
        // Stream Solution!!!!!!!
        public static Map<String, List<Person>> groupByNationality_Stream (List < Person > people) {
            return people.stream()
                    .collect(Collectors.groupingBy(person -> person.getNationality(), Collectors.toList()));
        }



}
