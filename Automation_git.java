import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automation_git {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\selenium-java\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		// Launching website
		driver.navigate().to("http://demo.guru99.com/insurance/v1/index.php");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		
		/*try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//Go to Registerpage 
		WebElement register=driver.findElement(By.linkText("Register"));
		register.click();
		
		//Go to Loginpage
		WebElement login=driver.findElement(By.linkText("Login"));
		login.click();
		
		
		//Login
		WebElement email=driver.findElement(By.name("email")); 
		email.sendKeys("sirisha@gmail.com");
		
		WebElement password=driver.findElement(By.name("password")); 
		password.sendKeys("sirisha");
		
		WebElement loginbtn=driver.findElement(By.name("submit")); 
		loginbtn.click();
		
		
	}

}
