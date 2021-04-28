package Besic_Learning_TestNG;

import org.testng.annotations.Test;

public class DependsOnGroup1 {
@Test(dependsOnGroups={"chetan","uday"})
	public void  m1() {
		System.out.println("this is m1");
	}
	
@Test(groups="chetan")
public void m2() {
	System.out.println("this is m2");
}
	
@Test(groups="uday")
public void m3() {
	System.out.println("this is m3");
	
@Test(groups="sujit")
public void m4() {
	System.out.println("this is m4");
}
}
}
