package HomeWork8.FormAuthentication;

import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginPageTest {
    private final LoginPage loginPage = new LoginPage();
    private final SecurePage securePage = new SecurePage();
    String loginPageUrl = "http://the-internet.herokuapp.com/login";


    @Test
    public void testLoginPage() {
        open(loginPageUrl);
        loginPage.toggleLoginPage();
        securePage.toggleSecurePage();
        loginPage.badLogin();
        Selenide.sleep(5000);

    }
}
