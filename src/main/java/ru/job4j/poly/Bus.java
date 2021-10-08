package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        String move = "Ехать";
        System.out.println(move);
    }

    @Override
    public void passenger(int human) {
        String result = "Число пассажиров: " + human;
        System.out.println(result);
    }

    @Override
    public int fuel(int liter) {
        int dist = 100;
        int price = dist * liter;
        System.out.println(price);
        return price;
    }
}
