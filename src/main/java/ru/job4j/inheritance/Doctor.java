package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String spec;
    private int seniority;

    public Doctor(String name, String surname, String education, String birthday,
                  String spec, int seniority) {
        super(name, surname, education, birthday);
        this.spec = spec;
        this.seniority = seniority;
    }

    public String getSpec() {
        return spec;
    }

    public int getSeniority() {
        return seniority;
    }

    public String getSurname() {
        return getSurname();
    }

    public String getName() {
        return getName();
    }

    public String getEducation() {
        return getEducation();
    }

    public String getBirthday() {
        return getBirthday();
    }

    public Diagnosis heal() {
        return heal();
    }
}
