package selenium_java_activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Activity6_java {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void login(){
        //login application
        String url="https://alchemy.hguy.co/jobs";
        WebDriverManager.firefoxdriver().setup();
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
        driver= new FirefoxDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @Test
    public void ApplyToJob(){
        wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        System.out.println(driver.getTitle());
        //Navigate to job url
        driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).click();
        //Search for particular title
        driver.findElement(By.id("search_keywords")).sendKeys("Banking");
        //Search for results
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/form/div[1]/div[4]/input")).click();
        //wait for list
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div/main/article/div/div/ul")));
        //select the job
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/ul/li[1]/a")).click();
        //Apply for job
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/div/div[3]/input")).click();
        //Print email id
        String email=driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/div/div[3]/div/p/a")).getText();
        System.out.println("Email id: "+email);

    }
    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }

}
