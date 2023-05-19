package project;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Activity1 {
    //Driver initialization
    AndroidDriver driver;
    //Waits
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Desired capabilities
        UiAutomator2Options caps= new UiAutomator2Options().setPlatformName("android").
                setAutomationName("uiAutomator2").
                setAppPackage("com.google.android.apps.tasks").
                setAppActivity(".ui.TaskListsActivity").
                noReset();
        //Appium server url
        URL serverUrl= new URL("http://localhost:4723/wd/hub");

        //Driver installations
        driver=new AndroidDriver(serverUrl,caps);
        //waits
        wait= new WebDriverWait(driver, Duration.ofMillis(10));

    }
    @Test(priority = 1)
    public void validateGoogleTask1() throws InterruptedException {
        //Find the NewList and Click
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/tasks_fab")).click();
        Thread.sleep(500);
        WebElement task = driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title"));
        task.click();
        task.sendKeys("Complete Activity with Google Tasks");
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();

    }
    @Test (priority =2)
    public void validateGoogleTask2() throws InterruptedException {
        //Find the NewList and Click
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/tasks_fab")).click();
        Thread.sleep(500);
        WebElement task = driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title"));
        task.click();
        task.sendKeys("Complete Activity with Google Keep");
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
    }
    @Test(priority = 3)
    public void validateGoogleTask3() throws InterruptedException {
        //Find the NewList and Click
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/tasks_fab")).click();
        Thread.sleep(500);
        WebElement task = driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title"));
        task.click();
        task.sendKeys("Complete second Activity with Google Tasks");
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();

    }
    @Test (priority = 4)
    public void asserttasks(){
        //Assertions
        List<WebElement> tasksadded =driver.findElements(AppiumBy.xpath("//android.widget.TextView[@resource-id='com.google.android.apps.tasks:id/task_name']"));
        System.out.println(tasksadded.size());
        Assert.assertEquals(tasksadded.size(),3);

    }

}
