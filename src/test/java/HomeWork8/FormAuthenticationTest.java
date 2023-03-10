//package HomeWork8;
//
//import com.codeborne.selenide.SelenideElement;
//
//import static com.codeborne.selenide.Selenide.$;
//import static com.codeborne.selenide.Selenide.open;
//
//
//public class FormAuthenticationTest {
//public  void loginPage(){
//        SelenideElement username = $("#username");
//        SelenideElement password = $("#password");
//        SelenideElement btnLogin = $("button[type='submit']");
//        SelenideElement badLogin =  $(".flash.error");
//}
//public  void securePage() {
//        SelenideElement btnLogout = $("[href='/logout']");
//        SelenideElement successfulLogin =  $(".flash.success");
//}
//        public void enterLogin(String username){
//                username.setValue(username);
//                password.setValue("SuperSecretPassword!");
//                btnLogin.click();
//                btnLogout.click();
//        username.setValue("rinatsmith");
//        password.setValue("badPassword!");
//        btnLogin.click();
//        badLogin.shouldHave(text("Ваше имя пользователя недействительно!"));
//    }
//}
//
