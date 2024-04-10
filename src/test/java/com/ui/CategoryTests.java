package com.ui;


import com.ui.model.Category;
import com.ui.model.Page;
import org.testng.annotations.Test;

import java.util.List;

public class CategoryTests extends BaseUiConfig {

    @Test
    public void checkSubItemsNamesInDropDownListForSecurityCategoryTest() {
        MainPage.open();
        new MainPage()
                .getHeaderArea()
                .clickCategory()
                .selectItem(Category.CYBER_SECURITY)
                .shouldHaveSubItems(List.of(
                        Page.BLOCKCHAIN.getTitle(),
                        "Computer Security",
                        "Network Security",
                        "Information Security",
                        "Internet Security",
                        "Wireless Security"
                ));
    }

    @Test
    public void checkRedirectionFromCategoryDropDownTest() {
        MainPage.open();
        Page sqlPage = Page.SQL;
        new MainPage()
                .getHeaderArea()
                .clickCategory()
                .selectItem(Category.DATABASES)
                .selectSubItem(sqlPage)
                .shouldHaveTitle(sqlPage.getTitle());
    }


}
