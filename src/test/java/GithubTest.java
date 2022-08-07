import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class GithubTest {

    @BeforeAll
    public static void testBase(){
        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    public void comparePlansTest(){
        open("/");
        GithubPage.openPricingPage();
    }

    @Test
    public void dragAndDropTest(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        GithubPage.dragAndDrop($("#column-a"), $("#column-b"));
    }
}
