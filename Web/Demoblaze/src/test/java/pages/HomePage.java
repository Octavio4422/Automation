package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utiils.BasePage;

public class HomePage extends BasePage {
    @FindBy(id = "signin2")
    private WebElement singUpButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSingUpButton() {
        return singUpButton;
    }
}
