package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Класс для демонстрации сортировки с использованием анонимного класса
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 21.02.2020
 * @version 1.0
 */
public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getSize() - right.getSize();
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);

        Comparator<Attachment> compByName = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getName().compareTo(right.getName());
            }
        };
        attachments.sort(compByName);
        System.out.println(attachments);

        ArrayList<Integer> list = new ArrayList<Integer>() {
            @Override
            public boolean add(Integer integer) {
                System.out.println("A new integer value " + integer + " is being added");
                return super.add(integer);
            }
        };
    }
}
