package Besic_Learning_TestNG;

import org.testng.annotations.Test;

public class DemoDependsonMetrhod {
	@Test(dependsOnMethods="m3")
public void m1() {
	System.out.println("m1");
}
	@Test
public void m2() {
	System.out.println("m2");
}
	@Test
public void m3() {
	System.out.println("m3");
}
	@Test(dependsOnMethods="m2")
public void m4() {
	System.out.println("m4");
}
}
