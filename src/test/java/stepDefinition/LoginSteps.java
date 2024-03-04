package stepDefinition;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ParabankHomePage;

import java.lang.reflect.Parameter;

import static actions.Actions.click;
import static actions.Actions.isDisplayed;

public class LoginSteps extends AbstractStep{

    @When("User navigate to the website homepage")
    public void user_navigate_to_the_website_homepage() throws InterruptedException {
        isDisplayed(parabankHomePage.getHomePageParabankLogo());
        click(parabankHomePage.getLoginButton());
        isDisplayed(parabankHomePage.getErrorMessage());
        Thread.sleep(4000);
    }
}
