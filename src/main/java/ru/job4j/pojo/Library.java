package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book kolobok = new Book("Kolobok", 7);
        Book chipolino = new Book("Chipolino", 20);
        Book buratino = new Book("Buratino", 30);
        Book maugli = new Book("Clean code", 50);
        Book[] tale = new Book[4];
        tale[0] = kolobok;
        tale[1] = chipolino;
        tale[2] = buratino;
        tale[3] = maugli;
        for (int index = 0; index < tale.length; index++) {
            Book story = tale[index];
            System.out.println(story.getName() + " : " + story.getCount());
        }
        tale[0] = maugli;
        tale[3] = kolobok;
        for (int index = 0; index < tale.length; index++) {
            Book story = tale[index];
            System.out.println(story.getName() + " : " + story.getCount());
        }
        System.out.println("С именем Clean code");
        for (int index = 0; index < tale.length; index++) {
            Book story = tale[index];
            if (story.getName().equals("Clean code")) {
                System.out.println(story.getName() + " : " + story.getCount());
            }
        }
    }
}
