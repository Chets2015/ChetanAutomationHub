package DataPrividerDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleDataProvider {
	@Test(dataProvider = "StudentInfo")
	public void SudentInfo(String username, int password) {
		System.out.println("Username:  " + username + "  " + "Password:  " + password);
	}

	@DataProvider(name = "StudentInfo")
	public Object[][] StudentData() {
		Object[][] value = { { "Sujit", 123 },
				             { "Chetan", 456 },
				             { "Uday", 789 } ,{"Aayansh", 989}
				           };
		return value;
	}
}