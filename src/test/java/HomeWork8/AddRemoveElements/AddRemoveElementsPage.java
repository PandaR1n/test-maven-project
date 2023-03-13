package HomeWork8.AddRemoveElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AddRemoveElementsPage {

    SelenideElement addElement = $("button[onclick='addElement()']");


    public void  toggleAddRemoveElementsPage (){
        for (int i = 0; i < 3 ; i++) {
            addElement.click();

        }
    }

}
