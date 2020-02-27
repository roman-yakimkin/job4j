package ru.job4j.stream;

/**
 * Класс - профиль клиента
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class Profile {
    /**
     * Адрес клиента
     */
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
