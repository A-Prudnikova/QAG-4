package pageobjects.scenarios;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RegFormTests {
    RegFormPage regFormPage = new RegFormPage();

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;

    }

    @Test
    void successfulFillTest() {
        regFormPage.openPage();
        regFormPage.fillData();
        regFormPage.checkData();


    }
}
