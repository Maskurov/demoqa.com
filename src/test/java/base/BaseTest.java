package base;
import common.CommonActions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.elements.textbox.TextBox;

import static common.Config.CLEAR_COOKIES;
import static common.Config.HOLD_BROWSER_OPEN;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected TextBox textBox = new TextBox(driver);


    @AfterEach
    void clearCookiesAndLocalStorage(){
        if (CLEAR_COOKIES){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeAsyncScript("window.sessionStorage.clear()");

        }
    }

    @AfterAll
    void close(){
        if (!HOLD_BROWSER_OPEN){
            driver.close();
        }
    }

}
