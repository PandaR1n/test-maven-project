package HomeWork8.FormAuthentication;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SecurePage {

    SelenideElement  successfully = $(".flash.success");
    SelenideElement btnLogout = $(By.xpath("//*[text()=' Logout']"));

    public void toggleSecurePage (){
        successfully.shouldHave(text("You logged into a secure area!")); {
            System.out.println( "Успешно");
        }
        btnLogout.click();
    }
}
