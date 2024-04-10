package com.ui;

import com.codeborne.selenide.Selenide;
import lombok.Getter;

public class MainPage {

    @Getter
    private final HeaderArea headerArea = new HeaderArea();

    public static void open() {
        Selenide.open("/index.htm");
    }
}
