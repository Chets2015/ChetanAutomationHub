package Besic_Learning_TestNG;

import org.testng.annotations.Test;

public class DependsOnGroupPractice {
	@Test(dependsOnGroups = "smoke")
	public void m1() {
		System.out.println("m1");
	}

	@Test(groups = "smoke")
	public void m2() {
		System.out.println("m2");
	}

	@Test
	public void m5() {
		System.out.println("m5");
	}
	@Test(dependsOnGroups="regression")
	public void m3() {
		System.out.println("m3");
	}

	@Test(groups = "regression")
	public void m4() {
		System.out.println("m4");
	}
}
