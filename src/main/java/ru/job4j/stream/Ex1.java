package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-2);
        list.add(-1);
        list.add(0);
        list.add(1);
        list.add(2);

        List<Integer> numbers = list.stream().filter(
                l -> l >= 0).collect(Collectors.toList());
        numbers.forEach(System.out::println);
    }
}

