package epita.fr.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import epita.fr.datamodel.Person;

public class PersonDataService {
	
	public int averageAge(List<Person> persons) {
		int ageSum = 0;
		int totalPerson = persons.size();
		for(Person person : persons) {
			ageSum = ageSum + person.getAge();
		}
		return ageSum/totalPerson;
	}
	
	public List<Person> filter(List<Person> persons, int thresholdAge) {
		List<Person> filteredList = new ArrayList<Person>();
		for(Person person : persons) {
			if(person.getAge() == thresholdAge) {
				filteredList.add(person);
			}
		}
		return filteredList;
	}
	
	public int calculateYearOfBirth(Person person) {
		int currYear = Calendar.getInstance().get(Calendar.YEAR);
		return currYear - person.getAge();
	}

}
