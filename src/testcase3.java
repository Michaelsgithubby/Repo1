import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase3 {

	public static void main(String[] args) {
		// I want to set up my location
         System.setProperty("webdriver.chrome.driver","C:\\Users\\micha\\Downloads\\chromedriver\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.google.com/");
         
	}

}
