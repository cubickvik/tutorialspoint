package com.ui.model;

import lombok.Getter;

public enum Category {

    AI_ML_AND_DATA_SCIENCE("AI, ML, and Data Science"),

    PROGRAMMING_LANGUAGES("Programming Languages"),

    WEB_DELELOPMENT("Development Languages"),

    DEVOPS("DevOps"),
    DATABASES("Databases"),

    COMPUTER_SCIENCE_SUBJECTS("Computer Science Subjects"),

    PYTHON_TECHNOLOGIES("Python Technologies"),

    SOFTWARE_TESTING("Software Testing"),
    CYBER_SECURITY("Cyber Security");

    @Getter
    private String item;

    Category(String item) {
        this.item = item;
    }

}
