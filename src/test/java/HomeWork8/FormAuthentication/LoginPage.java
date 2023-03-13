package HomeWork8.FormAuthentication;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    SelenideElement username = $(By.id("username"));
    SelenideElement password = $(By.id("password"));
    SelenideElement btnLogin = $(By.xpath("//*[text()=' Login']"));
    SelenideElement unsuccessfully = $(".flash.error");

    public void toggleLoginPage() {

        username.setValue("tomsmith");
        password.setValue("SuperSecretPassword!");
        btnLogin.click();
    }

    public void badLogin() {
        username.setValue("dasdasdasd");
        password.setValue("dsadasd");
        btnLogin.click();
        unsuccessfully.shouldHave(text("Your username is invalid!"));
        {
            System.out.println(" не успешно");
        }
    }
}
