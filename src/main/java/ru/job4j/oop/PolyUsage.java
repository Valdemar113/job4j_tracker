package ru.job4j.oop;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle su = new Plane();
        Vehicle an = new Plane();
        Vehicle freight = new Train();
        Vehicle sapsan = new Train();
        Vehicle higer = new Bus();
        Vehicle icarus = new Bus();

        Vehicle[] vehicles = new Vehicle[]{su, an, freight, sapsan, higer, icarus};
        for (Vehicle x : vehicles) {
            x.move();
        }

    }
}
