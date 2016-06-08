package practice.designpatterns.filter;

import java.util.ArrayList;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		// create some people
		Person malePerson = new Person("John","Male","Unmarried","Employed");
		Person femalePerson = new Person("Christy","Female","Married","Unemployed");
		// add some dummy person to a list
		List<Person> groupOfPeople = new ArrayList<Person>();
		groupOfPeople.add(malePerson);
		groupOfPeople.add(femalePerson);
		
		Criteria getAllMales = new FilterMale();
		List<Person> listOfAllMales = new ArrayList<Person>();
		listOfAllMales = getAllMales.meetCriteria(groupOfPeople);
		System.out.println(listOfAllMales);
		

	}

}
