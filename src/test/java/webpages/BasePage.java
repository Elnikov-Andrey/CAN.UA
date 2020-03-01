package webpages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class BasePage {

    public ResultPage search(String query) {
        $(By.id("headerSearch")).setValue(query).pressEnter();
        return page(ResultPage.class);
    }

}
