package Besic_Learning_TestNG;

import org.testng.annotations.Test;

public class DemoDependsonmMethod1 {
	@Test(timeOut=3000)
	public void m1() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("this is m1");
     }
     @Test(dependsOnMethods="m1")
	public void m2()
	{
		System.out.println("this is m2");
	}
	@Test
	public void m3(){
		System.out.println("this is m3");
	}
	@Test
	 public void m4(){
		 System.out.println("this is m4 ");
	 }
	 @Test
	 public void m5(){
		System.out.println("this is m5");
	 }
}


