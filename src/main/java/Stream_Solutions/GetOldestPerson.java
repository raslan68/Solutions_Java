package Stream_Solutions;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class GetOldestPerson {
    public static Person getOldestPerson(List<Person> people){
        Person oldestPerson = new Person("", 0);
        for(Person person : people){
            if (person.getAge() > oldestPerson.getAge()){
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }
    //Stream Solution
    public static Person getOldestPerson_stream(List<Person> people){
        return people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(null);
    }
}
