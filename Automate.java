import org.openqa.selenium.*;
import org.openqa.selenium.remote.session.ChromeFilter;
import org.openqa.selenium.chrome.*;
public abstract class Automate {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.getTitle();
	}

}
