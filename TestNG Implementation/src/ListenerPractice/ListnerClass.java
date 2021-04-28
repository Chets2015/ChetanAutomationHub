package ListenerPractice;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerDemo.class)
public class ListnerClass {
	@Test
	public void add() {
		Assert.assertEquals(1, 1);
	}

	@Test
	public void sub() {
		Assert.assertEquals(2, 1);
	}
}
