package practice.java8.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class PersonPredicate {
	
	public static Predicate<Person> isMale() {
		return p -> p.getGender().equalsIgnoreCase("Male");
	}
	
	public static Predicate<Person> isFemale() {
		return p -> p.getGender().equalsIgnoreCase("Female");
	}
	
	public static List<Person> filterPeople(List<Person> people, Predicate<Person> predicate) {
		return people.stream().filter(predicate).collect(Collectors.<Person>toList());
	}
}
