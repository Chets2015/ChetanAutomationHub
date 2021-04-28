package Besic_Learning_TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TesnNgePractice {
@Test(priority=5)
public void m1() {
	System.out.println("m1 test");
}
@BeforeSuite
public void m2() {
	System.out.println("m2 @BeforeSuite");
}
@BeforeClass
public void m3() {
	System.out.println("m3 @BeforeClass");
}
@Test
public void m4() {
	System.out.println("m4 @BeforeMethod");
}
@BeforeTest
public void m5() {
	System.out.println("m5 @BeforeTest");
}
@AfterMethod
public void m6() {
	System.out.println("m6 @AfterMethod");
}
@Test
public void m7() {
	System.out.println("m7 @AfterClass");
}
@AfterSuite
public void m8() {
	System.out.println("m8 @AfterSuite");
}
@AfterTest
public void m9() {
	System.out.println("m9 @AfterTest");
}
@AfterMethod
public void m10() {
	System.out.println("m10 @AfterMethod");
}
@Test(priority=4,successPercentage=50)
public void m11() {
	Assert.assertEquals(1, 1);
	Assert.assertEquals(1, 1);
	Assert.assertEquals(2, 1);
	System.out.println("m11 test");
}
@Test(priority=-10)
public void m12() {
	System.out.println("m12 test");
}
@Test(timeOut=4000)
public void m13() throws InterruptedException {
	//Thread.sleep(6000);
	System.out.println("m13 test");
}                 
}