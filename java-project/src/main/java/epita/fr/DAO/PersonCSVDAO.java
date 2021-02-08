package epita.fr.DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import epita.fr.datamodel.Person;

public class PersonCSVDAO {
	
	
	public static List<Person> readAll() throws FileNotFoundException {
		List<Person> persons = new ArrayList<Person>();
		File file = new File("data.csv");
		Scanner fileReader = new Scanner(file);
		String header[] = fileReader.nextLine().replace("\"", "").split(",");
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
		}
		fileReader.close();
		
		persons = sortList(persons);
		
		System.out.println("\n\nSORTED LIST (Height) Descending Order\n");
		
		System.out.println(header[0].trim()+"\t"+header[1].trim()+"\t"+header[2].trim()+"\t"+header[3].trim()+"\t"+header[4].trim());
		
		for(Person person: persons) {
			System.out.println(person.getName()+"\t"+person.getSex()+"\t"+person.getAge()+"\t"+person.getHeight()+"\t\t"+person.getWeight());
		}
		
		return persons;
		
	}
	
	public static void writeAll(List<Person> persons) throws IOException {
		FileWriter fileWriter = new FileWriter("data_output.csv");
		fileWriter.write("Name, Height (in), Weight (lbs), Age, Sex,");
		for(Person person: persons) {
			fileWriter.write("\n"+person.getName()+", "+person.getHeight()+", "+person.getWeight()+", "+person.getAge()+", "+person.getSex());
		}
		fileWriter.close();
	}
	
	private static List<Person> sortList(List<Person> persons){
		for(int i = 0; i < persons.size() - 1; i++) {
			for(int j = 0; j < persons.size() - i - 1 ; j++) {
				if(persons.get(j).getHeight() < persons.get(j+1).getHeight()) {
					Person temp = persons.get(j);
					persons.set(j, persons.get(j+1));
					persons.set(j+1, temp);
				}
			}
		}
		return persons;
	}

}
