package pageobjects.scenarios;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
public class RegFormTests {
    RegFormPage regFormPage = new RegFormPage();

    @Test
    void successfulFillTest() {
        RegFormPage.openPage();
        RegFormPage.fillData();
        RegFormPage.checkData();
    }
}
