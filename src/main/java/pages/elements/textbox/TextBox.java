package pages.elements.textbox;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBox extends BasePage {
    public TextBox(WebDriver driver) {
        super(driver);
    }

    public final By inputFullName = By.xpath("//input[@id='userName']");
    public final By inputEmail = By.xpath("//input[@id='userEmail']");
    public final By inputCurrentAddress = By.xpath("//textarea[@placeholder='Current Address']");
    public final By inputPermanentAddress = By.xpath("//textarea[@id='permanentAddress']");
    public final By inputButtonSubmit = By.xpath("//button[@id='submit']");




    public TextBox enterFullName(String username) {
        driver.findElement(inputFullName).sendKeys(username);
        return this;
    }

    public TextBox enterEmail(String email) {
        driver.findElement(inputEmail).sendKeys(email);
        return this;
    }

    public TextBox enterCurrentAddress(String currentAddress) {
        driver.findElement(inputCurrentAddress).sendKeys(currentAddress);
        return this;
    }

    public TextBox enterPermanentAddress(String permanentAddress) {
        driver.findElement(inputPermanentAddress).sendKeys(permanentAddress);
        return this;
    }

    public TextBox selectButtonSubmit() {
        driver.findElement(inputButtonSubmit).click();
        return this;
    }



}
