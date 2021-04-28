package ParellelTesting;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenBrowserTest {
	@Parameters("browserName")
	@Test
	public void openBrowser(String bName) {
		Browser.browser(bName);
	}
}
