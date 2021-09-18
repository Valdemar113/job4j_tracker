package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String highly;

    public Dentist(String name, String surname, String education, String birthday,
                   String highly, int seniority, String spec) {
        super(name, surname, education, birthday, spec, seniority);
        this.highly = highly;
    }

    public String getHighly() {
        return highly;
    }

    public String getName() {
        return getName();
    }

    public int getSeniority() {
        return getSeniority();
    }
}
