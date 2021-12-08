package ru.job4j.stream;

public class Driver {
    private String name;
    private String surname;
    private byte age;
    private String category;
    private byte experience;
    private byte shift;

    @Override
    public String toString() {
        return "Driver{"
                + "name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", age=" + age
                + ", category='" + category + '\''
                + ", experience=" + experience
                + ", shift=" + shift
                + '}';
    }

    static class Builder {
        private String name;
        private String surname;
        private byte age;
        private String category;
        private byte experience;
        private byte shift;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildSurname(String surname) {
            this.surname = surname;
            return this;
        }

        Builder buildAge(byte age) {
            this.age = age;
            return this;
        }

        Builder buildCategory(String category) {
            this.category = category;
            return this;
        }

        Builder buildExperience(byte experience) {
            this.experience = experience;
            return this;
        }

        Builder buildShift(byte shift) {
            this.shift = shift;
            return this;
        }

        Driver build() {
            Driver driver = new Driver();
            driver.name = name;
            driver.surname = surname;
            driver.age = age;
            driver.category = category;
            driver.experience = experience;
            driver.shift = shift;
            return driver;
        }
    }

    public static void main(String[] args) {
        Driver driver = new Builder().buildName("Ivan")
                .buildSurname("Petrov")
                .buildAge((byte) 32)
                .buildCategory("C")
                .buildExperience((byte) 10)
                .buildShift((byte) 2)
                .build();
        System.out.println(driver);
    }
}

