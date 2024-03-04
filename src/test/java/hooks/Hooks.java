package hooks;


import io.cucumber.java.*;
import org.openqa.selenium.chrome.ChromeDriver;
import stepDefinition.AbstractStep;


public class Hooks extends AbstractStep{
    @Before("@UI")
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "src\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(homePageUrl);
        driver.manage().window().maximize();
    }

    @After
    public void closeChromeDriver() {
        log.info("Calling method to close the browser");
        driver.close();
        driver.quit();

    }
}
