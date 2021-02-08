package epita.fr.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import epita.fr.DAO.PersonCSVDAO;
import epita.fr.datamodel.Person;

public class TestSER3 {
	
	public static void test() {
		List<Person> persons = new ArrayList<Person>();
		try {
			persons = PersonCSVDAO.readAll();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			PersonCSVDAO.writeAll(persons);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
