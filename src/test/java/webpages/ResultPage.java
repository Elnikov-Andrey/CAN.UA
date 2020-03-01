package webpages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class ResultPage {

    public ElementsCollection results() {
        return $$("a strong");
    }

}
