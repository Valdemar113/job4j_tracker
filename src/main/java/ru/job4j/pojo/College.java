package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Drozhzhin Vladimir Sergeevich");
        student.setGroup(" 56-P");
        student.setAdmission(new Date());

        System.out.println(student.getFio() + System.lineSeparator()
                + "Группа :" + student.getGroup() + System.lineSeparator()
                + "поступил " + student.getAdmission());
    }
}
