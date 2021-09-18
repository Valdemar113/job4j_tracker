package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String section;

    public Surgeon(String name, String surname, String education,
                   String birthday, String spec, int seniority, String section) {
        super(name, surname, education, birthday, spec, seniority);
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    public String getSurname() {
        return getSurname();
    }

    public String getSpec() {
        return getSpec();
    }

}
