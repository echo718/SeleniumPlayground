package Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCases1 extends BasicTestCases {

	@Test
	public void SecondTestCase() {
		System.out.println("Run SecondTestCase");
	}

	@Parameters({ "GoogleURL" })
	@Test
	public void ThirdTestCase(String urlname) {
		System.out.println("Run ThirdTestCase " + urlname);
	}

	// @Parameters({ "GoogleURL" }) Q:can't use with dataprovider?
	@Test(dataProvider = "getData")
	public void FourthTestCase1(String username, String password) {
		System.out.println("Run FourthTestCase1 " + username + password);

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] dataset = new Object[4][2];

		dataset[0][0] = "firstusername";
		dataset[0][1] = "firstusername";

		dataset[1][0] = "secondusername";
		dataset[1][1] = "secondusername";

		dataset[2][0] = "thirdusername";
		dataset[2][1] = "thirdusername";

		dataset[3][0] = "thirdusername";
		dataset[3][1] = "thirdusername";

		return dataset;

	}
}
