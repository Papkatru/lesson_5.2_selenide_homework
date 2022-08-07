import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;

public class GithubPage {

    public static void openPricingPage(){
        GithubElements.pricing.hover();
        GithubElements.comparePlans.click();
        GithubElements.comparePlansBody.shouldHave(text("Choose the plan that’s right for you."));
    }

    //Не стал заводить отдельные классы для dragAndDrop (хотя по-хорошему надо бы), реализовал в классах для github
    public static void dragAndDrop(SelenideElement elementA, SelenideElement elementB){
        elementA.dragAndDropTo(elementB);
        elementA.shouldHave(text("B"));
        elementB.shouldHave(text("A"));
    }
}
