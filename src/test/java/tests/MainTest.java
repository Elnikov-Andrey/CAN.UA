package tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.sun.tools.javac.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Keys;
import webpages.SetText;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainTest extends BaseTest {

    SetText setText = new SetText();
    String url = "https://can.ua/";

    @Test
    void checkMainPageLogo() {
        Assertions.assertTrue($(".main-logo").isDisplayed());
    }

//    @Test
//    void test(){
//        $("input.gLFyf")
//                .shouldBe(Condition.visible)
//                .setValue(setText.setText("dogs"))
//                .sendKeys(Keys.ENTER);
//        //$$("a.LC20lb DKV0Md").get(1).sendKeys((Keys.ENTER));
//                //.shouldBe(CollectionCondition.texts("Wikipedia"))
//                //.get(0)
//                //.getText()
//                //.contains("called");
//        Selenide.sleep(5000);
//        //CollectionCondition.exactTexts("called")
//    }
}
