package HomeWork8.KeyPresses;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class KeyPressesPageTest {

    KeyPressesPage keyPressesPage = new KeyPressesPage();
    String keyPressesPageUrl = "http://the-internet.herokuapp.com/key_presses";

    @Test
    public void testKeyPressesPage(){
        open (keyPressesPageUrl);
        keyPressesPage.toggleTextField();
    }
}
