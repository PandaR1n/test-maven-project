package HomeWork8.Hovers;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HoversPage {
    SelenideElement avatar1 = $("div[class='figure']");



    public void toggleHovers (){
       avatar1.click();
        avatar1.hover();
        avatar1.shouldHave(Condition.text("name: user1"));
    }
}
