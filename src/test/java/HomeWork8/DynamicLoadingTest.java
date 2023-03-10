package HomeWork8;

import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DynamicLoadingTest {
    @Test

    public void TestDynamicLoading() {
        open("http://the-internet.herokuapp.com/dynamic_loading");
        SelenideElement example2 = $("a[href='/dynamic_loading/2']");
        SelenideElement btnStart = $("div[id='start']");
        SelenideElement successfully = $(".Hello World!");

        example2.click();
        btnStart.click();

        successfully.shouldHave(text("Hello World!"));
    }
}
