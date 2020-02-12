package ru.job4j.search;

import java.util.ArrayList;

/**
 * Класс - телефонный справочник
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 12.02.2020
 * @version 1.0
 */
public class PhoneDictionary {
    /**
     * Коллекция абоненов
     */
    private ArrayList<Person> people = new ArrayList<Person>();

    /**
     * Добавиь абонента
     * @param person - добавляемый абонент
     */
    public void add(Person person) {
        this.people.add(person);
    }

    /**
     * Найти всех абонентов, любое поле которых подходит по ключу
     * @param key - ключ для поиска
     * @return - коллекция абонентов
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<Person>();
        for (Person person: people) {
            if (person.getName().contains(key) || person.getSurname().contains(key) || person.getPhone().contains(key) || person.getAddress().contains(key)) {
                result.add(person);
            }
        }

        return result;
    }


}
