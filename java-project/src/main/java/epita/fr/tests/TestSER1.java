package epita.fr.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import epita.fr.datamodel.Person;

public class TestSER1 {
	public static void test() throws FileNotFoundException{
		List<Person> persons = new ArrayList<Person>();
		File file = new File("data.csv");
		Scanner fileReader = new Scanner(file);
		fileReader.nextLine();
		int i = 0;
		while (fileReader.hasNextLine()) {
			String line = fileReader.nextLine();
		    String data[] = line.replace("\"", "").split(",");
		    Person person = new Person(
		    		data[0].trim(), 
		    		data[1].trim().charAt(0), 
		    		Integer.parseInt(data[2].trim()), 
		    		Integer.parseInt(data[3].trim()), 
		    		Integer.parseInt(data[4].trim())
		    	);
		    persons.add(person);
		    
			if(i == 1) {
				System.out.println(line);
			}
			i++;
		}
		fileReader.close();
	}
}
