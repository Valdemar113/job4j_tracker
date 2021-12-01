package ru.job4j.stream;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    Map<String, Student> mapTo(List<Student> students) {
        return students.stream()
              .collect(Collectors.toMap(Student :: getSurname,
                      student -> student, (surname1, surname2) -> surname1));
  }
}
