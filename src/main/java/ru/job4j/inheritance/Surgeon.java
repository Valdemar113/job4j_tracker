package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String section;

    public Surgeon(String surname, String education,
                   String birthday, String spec, int seniority, String section, Diagnosis heal) {
        super(surname, education, birthday, spec, seniority, heal);
        this.section = section;

    }

    public String getSection() {
        return section;
    }

    public String getSurname() {

    }

    public String getSpec() {

    }

    public Diagnosis getHeal() {

    }
}
