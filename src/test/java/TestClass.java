import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

    public void webDriverChrome(){
        String projectPath = System.getProperty("user.dir");
        String driverPath = projectPath + "\\src\\test\\resources\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver",driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.quit();
    }
}
