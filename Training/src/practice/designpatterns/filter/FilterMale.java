package practice.designpatterns.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePerson = new ArrayList<Person>();
		for(Person person : persons) {
			if(person.getGender().equalsIgnoreCase("Male")) {
				malePerson.add(person);
			}
		}
		return malePerson;
	}
}
