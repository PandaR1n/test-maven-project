package HomeWork8.AddRemoveElements;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class AddRemoveElementsPageTest {

    AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage();


    @Test
    public void testAddRemoveElementsPage (){
        open ("http://the-internet.herokuapp.com/add_remove_elements/");
        addRemoveElementsPage.toggleAddRemoveElementsPage();
    }
}
