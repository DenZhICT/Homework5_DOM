package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class H1Test {
    @Test
    void differ(){
        open("https://github.com/qa-guru/knowledge-base/wiki");
        $("div template").pressEnter();//Element should be interactable {div template}
    }
}
