package HomeWork8.KeyPresses;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class KeyPressesPage {
    SelenideElement textField = $("input[type = 'text']");
    SelenideElement resultPress = $ ("p[id = 'result']");


    public void toggleTextField(){
        textField.click();
        textField.sendKeys(Keys.TAB);
        resultPress.shouldHave(text("You entered: TAB"));

    }
}
