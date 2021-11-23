package ru.job4j.function;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;
import java.util.ArrayList;
import java.util.List;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (s, s1) -> map.put(s, s1);
        biCon.accept(1, "one");
        biCon.accept(2, "two");
        biCon.accept(3, "three");
        biCon.accept(4, "four");
        biCon.accept(5, "five");
        biCon.accept(6, "six");
        biCon.accept(7, "seven");

        BiPredicate<Integer, String> biPred = (i, s) -> i % 2 == 0 || s.length() == 4;
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
            con.accept(func.apply(s));
        }
    }

}
