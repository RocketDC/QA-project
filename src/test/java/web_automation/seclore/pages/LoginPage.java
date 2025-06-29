package web_automation.seclore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Seclore Partner logo
    @FindBy(xpath = "(//img[@alt='Seclore Partner Center Logo'])[2]")
    private WebElement logoSeclorePartner;

    //Click seclore logo
    @FindBy(xpath = "")
    private WebElement 
    
}
