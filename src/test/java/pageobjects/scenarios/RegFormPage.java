package pageobjects.scenarios;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegFormPage {

    String name = "Ana",
            surname = "Yyy",
            email = "Yyy@aaa.ru",
            phone = "1234567890",
            subject = "English",
            address = "Street N build.123",
            state = "NCR",
            city = "Delhi";

    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
    }
    public void fillData() {
        $("#firstName").setValue(name);
        $("#lastName").setValue(surname);
        $("#userEmail").setValue(email);
        $(byText("Male")).click();
        $(byText("Female")).click();
        $(byText("Other")).click();
        $("#userNumber").setValue(phone);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("0");
        $(".react-datepicker__year-select").selectOptionByValue("1910");
        $(".react-datepicker__day--003").click();
        $("#subjectsInput").setValue(subject).pressEnter();
        $(byText("Sports")).click();
        $(byText("Reading")).click();
        $(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("ava.jpg");
        $("#currentAddress").setValue(address);
        $("#react-select-3-input").setValue(state).pressEnter();
        $("#react-select-4-input").setValue(city).pressEnter();
        $("#submit").click();

    }
    public void checkData() {

    }
}
