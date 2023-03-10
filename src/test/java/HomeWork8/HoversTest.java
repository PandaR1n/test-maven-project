package HomeWork8;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class HoversTest {

    public void testHovers() {
        open("http://the-internet.herokuapp.com/hovers");
        SelenideElement userAvatar1 = $$(".figure").get(0);
        userAvatar1.hover().shouldHave(text("View profile"));
        Selenide.sleep(5000);
    }
}
