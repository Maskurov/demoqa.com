package tests.textbox;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static constans.Constans.Urls.TEXT_BOX_PAGE;
import static org.junit.jupiter.api.Assertions.*;

public class TextBoxTest extends BaseTest {

    @Test
    public void checkIsRedirectTextBox() {
        basePage.goToUrl(TEXT_BOX_PAGE);
        textBox.enterFullName("Ivanov Ivan Ivanovich")
                .enterEmail("ivanov@gmail.com")
                .enterCurrentAddress("street Pushkina, house Kolotushkina")
                .enterPermanentAddress("street Kolotushkina, house Pushkina")
                .selectButtonSubmit();

    }

}