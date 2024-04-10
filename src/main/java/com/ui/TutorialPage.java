package com.ui;

import com.codeborne.selenide.Condition;
import lombok.Getter;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class TutorialPage {

    @Getter
    private final HeaderArea headerArea = new HeaderArea();

    public TutorialPage shouldHaveTitle(String title) {
        $(".tutorial-content h1").should(Condition.exactText(title + " Tutorial"), Duration.ofSeconds(20));
        return this;
    }
}
