package ru.job4j.pojo;

/**
 * Класс - библиотека
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 26.01.2020
 * @version 1.0
 */
public class Library {

    /**
     * Статическая функция для запуска класса
     * @param args - аргументы для запуска
     */
    public static void main(String[] args) {
        Book book1 = new Book("The war and peace", 1500);
        Book book2 = new Book("Eugene Onegin", 200);
        Book book3 = new Book("Clean code", 650);
        Book book4 = new Book("Don Quixote", 350);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (Book book : books) {
            System.out.println(book.getName() + " contains " + book.getPagesCount() + " pages");
        }

        Book bookTmp = books[3];
        books[3] = books[0];
        books[0] = bookTmp;

        System.out.println("After moving of the books =====");
        for (Book book : books) {
            System.out.println(book.getName() + " contains " + book.getPagesCount() + " pages");
        }
        System.out.println("Now we're trying to filter out and display all the books having name \"Clean code\" =====");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals("Clean code")) {
                System.out.println("A book indexed " + i + " with name " + book.getName() + " contains " + book.getPagesCount() + " pages");
            }
        }

    }
}
