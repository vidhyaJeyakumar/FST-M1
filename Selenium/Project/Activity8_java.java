package selenium_java_activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8_java {
    WebDriver driver;
    @BeforeClass
    public void login(){
        //login application
        String url="https://alchemy.hguy.co/jobs/wp-admin";
        WebDriverManager.firefoxdriver().setup();
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        driver= new FirefoxDriver();
        driver.get(url);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @Test
    public void websiteBackendLogin(){
        //login user
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
        //Verify login
        String pageTitle= driver.getTitle();
        System.out.println("Title of Page: "+pageTitle);
        Assert.assertEquals(pageTitle,"Dashboard ‹ Alchemy Jobs — WordPress");
    }
    @AfterClass
    public void closeBrowser(){

        driver.quit();
    }

}
