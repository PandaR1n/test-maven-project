package HomeWork8.DynamicLoading;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DynamicLoadingPage {
    SelenideElement example2 = $("a[href='/dynamic_loading/2']");

    public void toggleDynamicLoading() {
        example2.click();
    }

}
