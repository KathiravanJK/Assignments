package TestNG;

import org.testng.annotations.Test;

public class HandleDependencies {
	
	@Test(enabled = true)
	public void sSLC() {
		System.out.println("10th Pass");
	}
	
	@Test(dependsOnMethods = "sSLC")
	public void hSC() {
		System.out.println("12th Pass");
	}
	
	@Test(dependsOnMethods = "hSC")
	public void bachelorDegree() {
		System.out.println("Bachelor Degree Pass");
	}
	
	@Test(dependsOnMethods = "bachelorDegree")
	public void  masterDegree() {
		System.out.println("Master Degree Pass");
	}

}
