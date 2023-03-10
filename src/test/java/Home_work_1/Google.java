package Home_work_1;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Google {
    @Test
    public void googleTest() {

        open("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%26ogbl%2F&ltmpl=default&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
        SelenideElement firstName = $("#firstName");
        SelenideElement lastName = $("#lastName");
        SelenideElement username = $("#username");
        SelenideElement newPassword = $("input[type='password'][name='Passwd']");
        SelenideElement confirmPasswd = $("input[type='password'][name='ConfirmPasswd']");
        SelenideElement btnNext = $(By.id("accountDetailsNext"));

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String usernameStr=null;
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(alphabet.length());
            usernameStr += alphabet.charAt(index);
        }

        firstName.setValue("Ринат");
        lastName.setValue("Саликов");
        username.setValue(usernameStr);
        newPassword.setValue("543223rewq");
        confirmPasswd.setValue("543223rewq");
        btnNext.click();


        Selenide.sleep(20020);

    }

}
