import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiAutomation {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/sukanya/IdeaProjects/selenium_java/src/test/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
//        driver.navigate().to("https://saucelabs.com/");
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
        driver.findElement(By.xpath("//a[contains(text(),'Facebook')]"));
        boolean isdiplayed = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).isDisplayed();
        System.out.println(isdiplayed);
        boolean isenabled = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).isEnabled();
        System.out.println(isenabled);
        driver.close();
    }
}
