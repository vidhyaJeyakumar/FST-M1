package selenium_java_activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity7_java {
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
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @Test
    public void createNewJobListing(){
        //Navigate to job posting
        driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[3]/a")).click();
        driver.findElement(By.id("create_account_email")).sendKeys("vidhya22262534453@gmail.com");
        driver.findElement(By.id("job_title")).sendKeys("test analyst");
        Select jobType= new Select(driver.findElement(By.id("job_type")));
        jobType.selectByVisibleText("Full Time");
        driver.findElement(By.id("application")).sendKeys("http://ibm.com");
        driver.findElement(By.id("job_description_ifr")).sendKeys("N/A");
        driver.findElement(By.id("company_name")).sendKeys("IBM");
        driver.findElement(By.id("company_website")).sendKeys("http://abc.com");
        driver.findElement(By.id("company_tagline")).sendKeys("Balance work");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/form/p/input[4]")).click();
        System.out.println(driver.getTitle());
        //Submit listing
        driver.findElement(By.id("job_preview_submit_button")).click();
        //Verify job posted successfully
        driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).click();
        driver.findElement(By.id("search_keywords")).sendKeys("test analyst");

    }
    @AfterClass
    public void closeBrowser(){

        driver.quit();
    }

}
