package epita.fr.tests;

import epita.fr.datamodel.Person;

public class TestDMO2 {
	
	public static void test(){
		Person person = new Person("Alex", 'M', 24, 163, 150);
		System.out.println(person.toString());
	}

}
