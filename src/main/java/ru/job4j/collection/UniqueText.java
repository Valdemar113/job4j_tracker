package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String dublicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = dublicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String rgn : origin) {
            check.add(rgn);
        }
        for (String txt : text) {
            if (!check.contains(txt)) {
                rsl =  false;
                break;
            }

        }
        return rsl;
    }
}
