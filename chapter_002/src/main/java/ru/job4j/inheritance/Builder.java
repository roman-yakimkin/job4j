package ru.job4j.inheritance;

/**
 * Класс - инженер - строитель
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 24.01.2020
 * @version 1.0
 */
public class Builder extends Engineer {

    /**
     * Список построенных зданий
     */
    protected Building[] buildings;

    public Building[] getBuildings() {
        return buildings;
    }

    public void setBuildings(Building[] buildings) {
        this.buildings = buildings;
    }
}
