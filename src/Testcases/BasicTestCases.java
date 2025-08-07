package Testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasicTestCases {

	// first execute method
	@Parameters({ "GoogleURL", "GoogleMapURL" })
	@BeforeTest
	public void BeforeTestCase(String urlname, String mapurl) {
		System.out.println("before test case to execute method " + urlname + mapurl);
	}

	// last execute method
	@AfterTest
	public void AfterTestCase() {
		System.out.println("the last test case to execute method");
	}

	@BeforeSuite
	public void BeforeSuiteTestCase() {
		System.out.println("the before suite test case to execute");
	}

	@AfterSuite
	public void AfterSuiteTestCase() {
		System.out.println("the after suite test case to execute");
	}

	@BeforeMethod
	public void BeforeMethodTestCase() {
		System.out.println("the before method test case to execute");
	}

	@Parameters({ "GoogleURL", "GoogleMapURL" })
	@Test(groups = { "FirstGroup" })
	public void RunTestNg(String urlname, String mapurl) {
		System.out.println("Run testng " + urlname + " " + mapurl);
	}

	@Test(groups = { "FirstGroup" }, timeOut = 2000)
	public void RunTestCase1() {
		System.out.println("Run testcase 1");
	}

	@Test(groups = { "FirstGroup" }, dependsOnMethods = { "RunTestCase3", "RunTestCase1" }, enabled = false)
	public void RunTestCase2() {
		System.out.println("Run testcase 2");
	}

	@Test(groups = { "FirstGroup" })
	public void RunTestCase3() {
		System.out.println("Run testcase 3");
	}

	@Test
	public void RunTestCase4() {
		System.out.println("Run testcase 4");
	}
}
