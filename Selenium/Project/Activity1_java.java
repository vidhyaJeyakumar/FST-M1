package selenium_java_activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1_java {
    WebDriver driver;
    @BeforeClass
    public void login(){
        //login application
        String url="https://alchemy.hguy.co/jobs";
        WebDriverManager.firefoxdriver().setup();
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        driver= new FirefoxDriver();
        driver.get(url);

    }
    @Test
    public void verifyWebsiteTitle(){
        String title=driver.getTitle().toString();
        System.out.println("Title of page: "+title);
        Assert.assertEquals(title,"Alchemy Jobs – Job Board Application");
    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
