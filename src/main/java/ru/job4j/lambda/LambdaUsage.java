package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaUsage {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("four");
        list.add("seven");
        Comparator<String> comparator = (left, right) -> {
            System.out.println("Integer.compare - " + right.length() + " : " + left.length());
            return Integer.compare(right.length(), left.length());
        };
        list.sort(comparator);
        System.out.println(list);
    }
}

