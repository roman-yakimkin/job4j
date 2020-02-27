package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Профили клиентов
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class Profiles {

    /**
     * Получить список адресов клиентов
     * @param profiles - список профилей клиентов
     * @return - список адресов клиентов
     */
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(Profile::getAddress).collect(Collectors.toList());
    }
}
