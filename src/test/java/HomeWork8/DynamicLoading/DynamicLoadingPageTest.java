package HomeWork8.DynamicLoading;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class DynamicLoadingPageTest {

    DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();
    DynamicLoading2Page dynamicLoading2Page = new DynamicLoading2Page();

    String dynamicLoadingPageUrl = "http://the-internet.herokuapp.com/dynamic_loading";

    @Test
    public void testDynamicLoadingPage() {


        open(dynamicLoadingPageUrl);
        dynamicLoadingPage.toggleDynamicLoading();
        dynamicLoading2Page.toggleDynamicLoading2Page();


    }
}