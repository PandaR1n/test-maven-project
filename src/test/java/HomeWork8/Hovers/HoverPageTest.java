package HomeWork8.Hovers;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class HoverPageTest {
    HoversPage hoversPage = new HoversPage();
    String hoverPageUrl = "http://the-internet.herokuapp.com/hovers";


    @Test
    public void testhoverPage () {
        open (hoverPageUrl);
        hoversPage.toggleHovers();

    }

}
