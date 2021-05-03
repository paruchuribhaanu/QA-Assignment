package sex.rabbitcams.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sex.rabbitcams.initiator.Driver;

public class Utility extends Driver {
	private JavascriptExecutor js;
	private Actions act;
	private WebDriverWait wait;
	
	
	public Utility() {
		act = new Actions(driver);
		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, 30);
	}
	
	
	
	

}
