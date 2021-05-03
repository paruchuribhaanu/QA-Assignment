package sex.rabbitcams.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sex.rabbitcams.initiator.Driver;
import sex.rabbitcams.pages.HomePage;

public class PerformerSearchTest extends Driver {
	public HomePage homePageObject;

	@BeforeMethod
	public void beforeTestt() {
		homePageObject = new HomePage();
	}

	@AfterClass
	public void afterTestt() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

	@Test (priority=2)
	public void PerformerNathanialSearchTest() throws InterruptedException {
		
		try 
		{
			Assert.assertEquals(homePageObject.SearchPerformerNathanial ()," Nathanial sex cams");
		}

		catch (Exception e) {
			System.out.println("Test Case Failed");
		}


	} 
	@Test (priority=1)
	public void PerformerJennySearchTest() throws InterruptedException {
		try
		{
			Assert.assertEquals("Jenny sex cams", homePageObject.SearchPerformerJenny());
		}
		catch (Exception e) {
			System.out.println("Test Case Failed");
		}

	}
}
