package ru.job4j.oop;

public class Error {

    private boolean active;

    private  int status;

    private  String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.message = message;
        this.status = status;
    }

    public void printInfo() {
        System.out.println("Активность: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 1, "Ошибка");
        error.printInfo();
        Error errorOne = new Error(false, 2, "Еще ошибка");
        errorOne.printInfo();
        Error errorTwo = new Error(true, 3, "И еще раз ошибка");
        errorTwo.printInfo();
        Error problem = new Error();
       problem.printInfo();
    }

}
