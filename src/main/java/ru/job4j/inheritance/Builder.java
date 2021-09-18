package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String rank;

    public Builder(String name, String surname, String education,
                   String birthday, String quality, String rank) {
        super(name, surname, education, birthday, quality);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public String getQuality() {
        return getQuality();
    }

    public String getBirthday() {
        return getBirthday();
    }
}
