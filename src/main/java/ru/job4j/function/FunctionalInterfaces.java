package ru.job4j.function;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;
import java.util.ArrayList;
import java.util.List;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (s, s1) -> System.out.println(s + " " + s1);
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.forEach(biCon);

        BiPredicate<Integer, String> biPred = (i, s) -> i % 2 == 0 || map.get(i).length() == 4;
        for (Integer i : map.keySet()) {
            if (biPred.test(i, map.get(i))) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }

        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());

        Consumer<String> con = s -> System.out.println(s);
        List<String> strings = sup.get();
        Function<String, String> func = s -> s.toUpperCase();
        for (String s : strings) {
            System.out.println(func.apply(s));
        }
    }

}
