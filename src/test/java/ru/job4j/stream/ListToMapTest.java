package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.*;

public class ListToMapTest {
    @Test
    public void whenListToMap() {
        List<Student> students = List.of(
                new Student(5, "Petrov"),
                new Student(10, "Ivanov"),
                new Student(15, "Sidorov"),
                new Student(15, "Sidorov")
        );
        ListToMap list = new ListToMap();
        Map<String, Student> result = list.mapTo(students);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Petrov", new Student(5, "Petrov"));
        expected.put("Ivanov", new Student(10, "Ivanov"));
        expected.put("Sidorov", new Student(15, "Sidorov"));
        Assert.assertEquals(result, expected);

    }
}