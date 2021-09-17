package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String lang;

    public Programmer(String name, String surname, String education,
                      String birthday, String quality, String lang) {
        super(name, surname, education, birthday, quality);
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }

    public String getQuality() {

    }

    public String getEducation() {

    }
}
