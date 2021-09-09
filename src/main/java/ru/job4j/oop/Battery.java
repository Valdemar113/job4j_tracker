package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery one = new Battery(80);
        Battery two = new Battery(19);
        System.out.println("Батарея 1 " + one.load + " Батарея 2 " + two.load);
        one.exchange(two);
        System.out.println("Батарея 1 " + one.load + " Батарея 2 " + two.load);
    }
}
