package practice.java8.predicate;

import java.util.ArrayList;
import java.util.List;

import practice.java8.predicate.Person;

import static practice.java8.predicate.PersonPredicate.filterPeople;
import static practice.java8.predicate.PersonPredicate.isMale;
import static practice.java8.predicate.PersonPredicate.isFemale;

public class PredicateTest {

	public static void main(String[] args) {
		
		// create some people
		Person malePerson = new Person("John","Male","Unmarried","Employed");
		Person femalePerson = new Person("Christy","Female","Married","Unemployed");
		// add some dummy person to a list
		List<Person> groupOfPeople = new ArrayList<Person>();
		groupOfPeople.add(malePerson);
		groupOfPeople.add(femalePerson);
		
		System.out.println(filterPeople(groupOfPeople, isFemale()));
		System.out.println(filterPeople(groupOfPeople, isMale()));
	

	}

}
