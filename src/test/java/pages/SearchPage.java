package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchPage {
    private SelenideElement textBox = $("#twotabsearchtextbox");
    private SelenideElement dropdownBox = $("#searchDropdownBox");
    private SelenideElement searchButton = $("#nav-search-submit-button");
    private SelenideElement resultsList = $(".sg-col-inner");
    private SelenideElement verifyTitle = $("#title_feature_div");
    private SelenideElement addButton = $(".a-button-stack");
    private SelenideElement addButtonInner = $(".a-button-inner");
    private SelenideElement closeDisplay = $("#aod-close");
    private SelenideElement check = $("#nav-cart-count-container");
    private SelenideElement checkName = $("#activeCartViewForm");

    public void openPage() {
        open("https://www.amazon.com");

    }

    public SearchPage dropdownBox(String itemType) {
        dropdownBox.setValue(itemType).click();
        return this;
    }

    public SearchPage setName(String itemName) {
        textBox.setValue(itemName).click();
        searchButton.click();
        return this;
    }


    public SearchPage OpenMenu(String name) {
        resultsList.$(byText(name)).click();
        verifyTitle.shouldHave(text(name));
        return this;
    }

}