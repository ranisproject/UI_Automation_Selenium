import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.*;
import org.apache.commons.io.FileUtils;

import javax.swing.*;
import javax.swing.text.Utilities;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;

public class UiAutomation {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver","/Users/sukanya/IdeaProjects/selenium_java/src/test/resources/chromedriver");

        WebDriver driver = new ChromeDriver(); //To access in-built methods of webdriver for browser specific actions like, get(),getUrl,getWindowHandle,
                                               //switchTo, findElement,navigate,manage
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
//        driver.findElement(By.xpath("//a[contains(text(),'Facebook')]"));
//        boolean isdiplayed = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).isDisplayed();
//        System.out.println(isdiplayed);
//        boolean isenabled = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).isEnabled();
//        System.out.println(isenabled);

//        Traversing
//        driver.findElement(By.xpath("//select/child::option[1]")).click();
//        driver.findElement(By.xpath("//select[@value='az']/parent::option[1]")).click();
//        driver.findElement(By.xpath("//select[@option='za']/following-sibling::option")).click();

//        Keyboard action
//        driver.findElement(By.xpath("loginbutton")).sendKeys(Keys.ENTER);

//        Multiple elements
//        List<WebElement> webElements = driver.findElements(By.xpath("//a"));

//        Select multiple elements
//        List<WebElement> webElements = driver.findElements(By.id("users"));
//        for(WebElement el : webElements){
//            if(el.getAttribute("value").equals("ABC") || el.getAttribute("value").equals("DEF")){
//                el.click();
//            }
//        }

//        select option from dropdown
//        Select select = new Select(driver.findElement(By.xpath("//a")));
//        List<WebElement> options = select.getOptions();
//        for(WebElement option : options){
//            if(option.getAttribute("value").equals("abc")){option.click();}
//        }

//        Javascript executor
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("windows.scrollBy(0,500)"); //down
//        js.executeScript("windows.scrollBy(0,-500)"); //up

//        Screenshot
//        TakesScreenshot screenshot = (TakesScreenshot)driver;
//        File file = screenshot.getScreenshotAs(OutputType.FILE);
//        File des = new File("D:/screenshot.png");
//        FileUtils.copyFile(file, des);

//        Action:
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(By.id("user"))).perform(); //mouse hover
//        actions.dragAndDrop("source webelement","des webelement").perform(); // drag and drop
//        actions.contextClick(driver.findElement(By.id("user"))).perform(); // right click

//        Alert
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        alert.dismiss();
//        alert.sendKeys("abc");
//        alert.getText();

//        Window handling
//        Set<String> windows = driver.getWindowHandles();
//        String parentWindow = driver.getWindowHandle();
//        for(String window : windows){
//            if(!window.equals(parentWindow)) {
//                driver.switchTo().window(window);
//            }
//        }

//        Iframe
//        driver.switchTo().frame(0);
//        driver.findElement(By.name("user-name")).sendKeys("standard_user");

//        Waits: implicit wait makes browser wait for certain amount of time, for an element available in DOM.
//               explicit wait makes browser to wait until a specific condition is met,
//               like elementIsClickable,elementToBeSelected, titleContains, urlContains, alertIsPresent
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("abc"))); //explicit wait
//
//        Wait wait1 = new FluentWait(driver).withTimeout(Duration.ofSeconds(5))
//                .pollingEvery(Duration.ofMillis(500))
//                .ignoring(Exception.class);






        driver.close();
    }
}
