package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import webpages.BasePage;
import webpages.Mysql;
import webpages.ResultPage;
import webpages.SetRequest;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class MainTest extends BaseTest {

    public void openPage(){
        BasePage basePage = open("http://olx.ua", BasePage.class);
    }

    @Test
    void chechUrlisCorrect(){
        openPage();
        String defaultUrl = "https://www.olx.ua/";
        String factUrl = url();
        System.out.println(factUrl);
        Assertions.assertTrue(factUrl.contains(defaultUrl));
    }

    @Test
    void checkMainPageLogo() {
        openPage();
        SelenideElement logo = $("#headerLogo");
        Assertions.assertTrue(logo.isDisplayed());
    }

    @Test
    void checkInputSearchField() {
        openPage();
        Assertions.assertTrue($("#headerSearch")
                .isDisplayed());
    }

    @Test
    void searchText(){
        openPage();
        SetRequest setRequest = new SetRequest();
        $("#headerSearch")
                .shouldBe(Condition.visible)
                .setValue(setRequest.setText("intel"))
                .sendKeys(Keys.ENTER);
        System.out.println($$(By.className("fleft")).size());
        Assertions.assertNotNull($(".fleft"));
    }

    @Test
    void calculatePictureElements(){
        searchText();
        int quantity = $$(By.className("price")).size();
        System.out.println("quantity is " + quantity);
        Assertions.assertTrue(quantity > 10);
    }

    @Test
    void calculateLinkElements(){
        searchText();
        int quantity = $$("a strong").size();
        System.out.println(quantity);
        Assertions.assertTrue(quantity>=0);
    }

    @Test
    void searchUsePageObject(){
        BasePage basePage = open("http://olx.ua", BasePage.class);
        ResultPage resultPage = basePage.search("samsung");
        System.out.println(resultPage.results().size());
    }

    @Test
    void putItemResultToDB(){
        Mysql mysql = new Mysql();
        mysql.addItemToDB();
    }
}
