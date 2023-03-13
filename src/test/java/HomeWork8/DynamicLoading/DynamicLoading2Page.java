package HomeWork8.DynamicLoading;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class DynamicLoading2Page {


    SelenideElement btnStart = $("#start button");
    SelenideElement finishText = $("#finish h4");


    public void toggleDynamicLoading2Page() {
        btnStart.click();

        Configuration.timeout = 30000;
        finishText.shouldBe(visible); // почему то не могу использовать waitUntil
        Configuration.timeout = 4000;
    }
}