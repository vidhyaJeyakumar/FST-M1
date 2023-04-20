package selenium_java_activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5_java {
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
    public void navigateToJobsPage(){
        System.out.println(driver.getTitle());
        //Navigate to url
        driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).click();
        //print the page title
        String title=driver.getTitle();
        System.out.println("Title of page: "+title);
        Assert.assertEquals(title,"Jobs – Alchemy Jobs");


    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
