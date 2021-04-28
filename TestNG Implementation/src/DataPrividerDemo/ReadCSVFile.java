package DataPrividerDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadCSVFile {
	@Test(dataProvider = "StudentInformation")
	public void StudentInfo(String username, String password) {
		System.out.println("Username:  " + username + "  " + "Password:  " + password);
	}

	@DataProvider(name = "StudentInformation")
	public Object[][] StudentData() throws FileNotFoundException {
		Object[][] value = new Object[3][2];
		Reader reader = new FileReader("C:\\Users\\Admin\\Desktop\\Selenium\\inputfiles\\Sujit.csv");
		BufferedReader br = new BufferedReader(reader);
		Scanner sc = new Scanner(br);
		int index = 0;
		while (sc.hasNext()) {
			String[] pair = sc.next().split(",");
			if(!pair[0].equals("Username")) {
			value[index][0] = pair[0];
			value[index][1] = pair[1];
			index++;
			}
		}
		return value;
	}
}