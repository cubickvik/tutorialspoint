package com.ui;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.ui.model.Category;
import com.ui.model.Page;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CategoryDropDownList {

    public CategoryDropDownList() {
        $(".dropdown__list-wrapper")
                .should(Condition.visible, Duration.ofSeconds(20));
    }

    public CategoryDropDownList selectItem(Category item) {
        return selectItem(item.getItem());
    }

    public CategoryDropDownList selectItem(String item) {
        $$(".dropdown__list-wrapper .category-button")
                .find(Condition.exactText(item))
                .click();
        return this;
    }

    public TutorialPage selectSubItem(String item) {
        $$(".categories-menu-section")
                .findBy(Condition.visible)
                .$$("a")
                .find(Condition.exactText(item))
                .click();
        return new TutorialPage();
    }

    public TutorialPage selectSubItem(Page item) {
        return selectSubItem(item.getTitle());
    }

    public CategoryDropDownList shouldHaveSubItems(List<String> subItemNames) {
        $$(".categories-menu-section")
                .findBy(Condition.visible)
                .$$("a")
                .should(CollectionCondition.exactTextsCaseSensitiveInAnyOrder(subItemNames), Duration.ofSeconds(20));
        return this;
    }

}
