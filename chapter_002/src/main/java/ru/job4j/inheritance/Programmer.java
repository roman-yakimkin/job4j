package ru.job4j.inheritance;

import java.util.Date;

/**
 * Класс - программист
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 24.01.2020
 * @version 1.0
 */
public class Programmer extends Engineer {

    /**
     * Ссылка на GitHub
     */
    protected String githubLink;

    public String getGithubLink() {
        return githubLink;
    }

    public void setGithubLink(String githubLink) {
        this.githubLink = githubLink;
    }

    /**
     * Выполнить задачу по программированию
     * @param job - задача
     * @param term - срок выполнения
     * @return истина, если задача успешно реализована
     */
    boolean executeJob(ProgramJob job, Date term) {

    }
}
