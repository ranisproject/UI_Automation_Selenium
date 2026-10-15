import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiAutomation {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/sukanya/IdeaProjects/selenium_java/src/test/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.close();
    }
}
