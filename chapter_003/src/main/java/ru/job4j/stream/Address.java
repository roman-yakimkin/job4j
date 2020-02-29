package ru.job4j.stream;

import java.util.Objects;

/**
 * Класс - адрес
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class Address {
    /**
     * Населенный пункт
     */
    private String city;
    /**
     * Улица
     */
    private String street;
    /**
     * Номер дома
     */
    private int home;
    /**
     * Номер квартиры
     */
    private int apartment;

    public Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    public Address(Address address) {
        this.city = address.city;
        this.street = address.street;
        this.home = address.home;
        this.apartment = address.apartment;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Address)) {
            return false;
        }
        Address address = (Address) o;
        return home == address.home
                && apartment == address.apartment
                && Objects.equals(city, address.city)
                && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, home, apartment);
    }

    @Override
    public String toString() {
        return "Address{" + "city='" + city + '\'' + ", street='" + street + '\'' + ", home=" + home + ", apartment=" + apartment + '}';
    }
}
