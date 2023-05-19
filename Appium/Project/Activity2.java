package project;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Activity2 {
    AndroidDriver driver;
    //Waits
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Desired capabilities
        UiAutomator2Options caps= new UiAutomator2Options().setPlatformName("android").
                setAutomationName("uiAutomator2").
                setAppPackage("com.google.android.keep").
                setAppActivity(".activities.BrowseActivity").
                noReset();
        //Appium server url
        URL serverUrl= new URL("http://localhost:4723/wd/hub");

        //Driver installations
        driver=new AndroidDriver(serverUrl,caps);
        //waits
        wait= new WebDriverWait(driver, Duration.ofMillis(10));

    }
    @Test
    public void validateGoogleKeep() throws InterruptedException {
        //Find the Newnote
        driver.findElement(AppiumBy.accessibilityId("New text note")).click();
        //add title to note
        Thread.sleep(500);
        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[8]/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText")).
                sendKeys("Mobile testing");

        //add description
        driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text")).
                sendKeys("Add a note to google keep");
        //press back button
        driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
        //Assertions
        List<WebElement> notes =driver.findElements(AppiumBy.xpath("(//androidx.cardview.widget.CardView[@content-desc=\"Mobile testing. Add a note to google keep. \"])[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout"));
        System.out.println(notes.size());
        Assert.assertEquals(notes.size(),1);

    }
}
