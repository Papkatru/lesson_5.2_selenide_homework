import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GithubElements {

    static SelenideElement
            pricing = $("[aria-label='Global']").find(byText("Pricing")),
            comparePlans = $$(".dropdown-menu").find(visible).find(byText("Compare plans")),
            comparePlansBody = $(".application-main");
}
