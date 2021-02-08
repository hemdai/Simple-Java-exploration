package epita.fr.tests;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import epita.fr.DAO.PersonCSVDAO;
import epita.fr.datamodel.Person;
import epita.fr.services.PersonDataService;

public class TestBLI1 {
	public static void test() {
		List<Person> persons = new ArrayList<Person>();
		
		try {
			persons = PersonCSVDAO.readAll();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PersonDataService personDataService = new PersonDataService();
		
		int average = personDataService.averageAge(persons);
		System.out.println("\n\nAverage: "+average);
		
		List<Person> filteredPersons = personDataService.filter(persons, 32);
		System.out.println("\n\nFiltered Persons by age 32");
		for(Person person : filteredPersons) {
			System.out.println(person.getName()+"\t"+person.getSex()+"\t"+person.getAge()+"\t"+person.getHeight()+"\t\t"+person.getWeight());
		}
		
		int birthYear = personDataService.calculateYearOfBirth(persons.get(0));
		System.out.println("\n\nBirth Year: "+birthYear);
	}
}
