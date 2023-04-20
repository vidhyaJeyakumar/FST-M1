package selenium_java_activity;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4_Java {

        WebDriver driver;

        @BeforeClass
        public void setUp(){
            String url="https://alchemy.hguy.co/jobs";
            WebDriverManager.firefoxdriver().setup();
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
            driver= new FirefoxDriver();
            driver.get(url);
        }

        @Test
        public void test(){
            String heading2= driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/h2")).getText();
            System.out.println(heading2);
            String actualString="Quia quis non";
            //Assertions
            Assert.assertEquals(heading2,actualString);

        }
        @AfterClass
        public void closebrowser(){
            driver.quit();
        }


}
