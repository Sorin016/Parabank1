package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ParabankHomePage extends PageObjects {

    @FindBy(xpath ="//body/div[@id='mainPanel']/div[@id='topPanel']/a[2]/img[1]")
    WebElement homePageParabankLogo;

    @FindBy(xpath = "//input[@value = 'Log In']")
    WebElement loginButton;

    @FindBy(xpath = "//p[contains(text(),'Please enter a username and password.')]")
    WebElement errorMessage;

    public ParabankHomePage(WebDriver driver) {
        super(driver);
    }
}
