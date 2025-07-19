package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }

    @AfterClass //helps clean up our test and acts like a post condition
    public  void  tearDown() {
        //tehere are 2 ways to close driver first one is quit and close. The difference between them is that quit closes every
        //window and quits the driver, but close only closes the current window
       // driver.quit();
    }

    @Test  //test annotation identifies pur test method
    public  void testLoggingIntoApplication() throws InterruptedException {
        //by is a class for locate a element
        //prefer id attribute mist of the time id attribute has unique value
        //webelement is an interface that represents html element
        Thread.sleep(2000);//it is a java sleep statement

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        var password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");


       driver.findElement(By.tagName("button")).click();
       Thread.sleep(2000);
       //testng will verify whether the actual results meet the expected results
        String actualResult = driver.findElement(By.tagName("h6")).getText();
        String expectedResult = "Dashboard";

        Assert.assertEquals(actualResult, expectedResult);
    }
}
