package HomeWork8.Checkbox;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class CheckboxesTest {

    private final CheckboxesPage checkboxesPage = new CheckboxesPage();
    String PAGE_URL = "http://the-internet.herokuapp.com/checkboxes";


    @Test
    public void testCheckbox() {
        open(PAGE_URL);
        checkboxesPage.toggleCheckbox();
        Selenide.sleep(5000);

    }



}
