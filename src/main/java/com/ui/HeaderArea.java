package com.ui;

import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class HeaderArea {

    public HeaderArea() {
        $(".dropdown__toggle").should(Condition.visible, Duration.ofSeconds(120));
    }

    public CategoryDropDownList clickCategory() {
        $(".dropdown__toggle").click();
        return new CategoryDropDownList();
    }

}
