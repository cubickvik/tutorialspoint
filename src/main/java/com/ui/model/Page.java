package com.ui.model;

import lombok.Getter;

@Getter
public enum Page {

    SQL("sql", "SQL", Category.DATABASES),
    COUCH_DB("couchdb", "CouchDB", Category.DATABASES),
    BLOCKCHAIN("blockchain", "Blockchain", Category.CYBER_SECURITY);

    private String url;
    private String title;
    private Category category;

    Page(String url, String title) {
        this.url = url + "/index.htm";
        this.title = title;
    }

    Page(String url, String title, Category category) {
        this.url = url;
        this.title = title;
        this.category = category;
    }
}
