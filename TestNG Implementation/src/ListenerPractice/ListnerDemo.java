package ListenerPractice;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerDemo implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {

		System.out.println("On test start");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on test sucess"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipp"+result.getName());
	}


	@Override
	public void onStart(ITestContext context) {
		System.out.println("On start");
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on finish");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTest failed but within Sucess percentage");
		
	}

}
