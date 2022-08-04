package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DivTest {
    @Test
    void differ() {
        open("https://github.com/qa-guru/knowledge-base/wiki");
        $("div").$("template").pressEnter();//Element not found {div/template}
    }
}
