import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
public abstract class Firefoxdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\selenium-java\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.getTitle();
	}

}
