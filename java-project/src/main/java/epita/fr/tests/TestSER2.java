package epita.fr.tests;

import java.io.FileNotFoundException;

import epita.fr.DAO.PersonCSVDAO;

public class TestSER2 {
	public static void test() {
		try {
			PersonCSVDAO.readAll();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
