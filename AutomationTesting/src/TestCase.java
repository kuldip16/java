
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
	public static WebDriver driver;

	public static void main(String[] args) {

		String url = "https://www.gmail.com";
		launchbrowser();
		geturl(url);
	    System.out.println("browser launched");
		quitbrowser();
	}

	public static void geturl(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static WebDriver launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	public static void quitbrowser(){
		driver.quit();
	}

}
