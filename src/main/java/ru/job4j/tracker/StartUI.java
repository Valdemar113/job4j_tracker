package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
          Item item = new Item();
          item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
        String createdFormat = item.getCreated().format(formatter);
        System.out.println("Текущая дата и время :" + createdFormat);
    }
    }

