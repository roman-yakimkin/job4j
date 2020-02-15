package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Сервис паспортного стола
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 14.02.2020
 * @version 1.0
 */
public class PassportOffice {
    /**
     * Список граждан с ключом по паспорту
     */
    private Map<String, Citizen> citizens = new HashMap<>();

    /**
     * Добавить гражданина в список
     * @param citizen - гражданин
     * @return - истина, если новый гражданин был добавлен
     */
    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (citizens.put(citizen.getPassport(), citizen) == null) {
            rsl = true;
        }
        return rsl;
    }

    /**
     * Получить информацию о гражданине по его паспорту
     * @param passport
     * @return - гражданин
     */
    public Citizen get(String passport) {
        return citizens.get(passport);
    }

}
