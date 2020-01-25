package ru.job4j.pojo;

import java.util.Date;

/**
 * Класс - студент
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 25.01.2020
 * @version 1.0
 */
public class Student {

    /**
     * ФИО студента
     */
    private String fullName;

    /**
     * Учебная группа
     */
    private String group;

    /**
     * Дата зачисления
     */
    private Date enrollmentDate;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}
