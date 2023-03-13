package HomeWork8.Checkbox;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckboxesPage {

    SelenideElement CHECKBOX_SELECTOR =  $(By.xpath(" //*[text()=' checkbox 1']/input"));


    public void toggleCheckbox() {
        CHECKBOX_SELECTOR.click();
        if (CHECKBOX_SELECTOR.isSelected()) {
            System.out.println("Флажок установлен");
        } else {
            System.out.println("Флажок не выбран");
        }
    }
}
