package ru.job4j.inheritance;

/**
 * Задача, связанная с программированием
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 24.01.2020
 * @version 1.0
 */
public class ProgramJob {

    /**
     * Название задачи
     */
    protected String name;

    /**
     * Описание задачи
     */
    protected String description;

    /**
     * Список необходимых технологий
     */
    protected Technology[] technologies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Technology[] getTechnologies() {
        return technologies;
    }

    public void setTechnologies(Technology[] technologies) {
        this.technologies = technologies;
    }
}
