package selenium_java_activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3_java {
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
    public void printUrlHeader(){
        driver.getTitle();
        String link=driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/header/div/img")).getAttribute("src");
        System.out.println("Header image url: "+link);

    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
