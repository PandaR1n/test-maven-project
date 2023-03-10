package HomeWork8;


import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CheckboxesTest {
@Test

    public void testCheckboxes() {
        open("https://the-internet.herokuapp.com/checkboxes");
        SelenideElement chkBx = $("input[type='checkbox']", 0);
        chkBx.click();
        chkBx.isSelected();
        chkBx.screenshot();

    }
}

