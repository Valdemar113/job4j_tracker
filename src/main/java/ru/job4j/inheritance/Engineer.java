package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String quality;

    public Engineer(String name, String surname, String education, String birthday,
                    String quality) {
        super(name, surname, education, birthday);
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }

    public String getSurname() {

    }

    public String getName() {

    }

    public String getEducation() {

    }

    public String getBirthday() {

    }
}
