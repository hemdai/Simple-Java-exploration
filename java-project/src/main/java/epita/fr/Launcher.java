package epita.fr;

import java.io.FileNotFoundException;

import epita.fr.tests.TestBLI1;
import epita.fr.tests.TestDMO2;
import epita.fr.tests.TestSER1;
import epita.fr.tests.TestSER2;
import epita.fr.tests.TestSER3;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDMO2.test();
		try {
			TestSER1.test();
			TestSER2.test();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TestSER3.test();
		
		TestBLI1.test();
	}

}
