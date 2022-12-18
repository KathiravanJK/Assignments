package TestNG;

import org.testng.annotations.Test;

public class GroupingTest {
	
	@Test(groups = "Leo Tolstoy")
	public void leoTolstoy1() {
		System.out.println("Resurrection");
	}
	
	@Test(groups = "Leo Tolstoy")
	public void leoTolstoy2() {
		System.out.println("War and Peace");
	}
	
	@Test(groups = "Jeyamohan")
	public void jeyaMohan1() {
		System.out.println("Aramm");
	}
	
	@Test(groups = "Jeyamohan")
	public void jeyaMohan2() {
		System.out.println("Vellai Yaanai");
	}

	@Test(groups = "Jayakanthan")
	public void jayaKanthan1() {
		System.out.println("Oru Manithan Oru Veedu oru ulagam");
	}
	
	@Test(groups = "Jayakanthan")
	public void jayaKanthan2() {
		System.out.println("Gurupeedam");
	}
	
	@Test(groups = "Jeyamohan")
	public void jeyaMohan3() {
		System.out.println("Kaithigal");
	}
	
	@Test(groups = "Ashokamithran")
	public void ashokamithran() {
		System.out.println("18vathu Achakoodu");
	}
	
}
