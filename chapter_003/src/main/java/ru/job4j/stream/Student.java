package ru.job4j.stream;

import java.util.Objects;

/**
 * Класс - студент
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class Student implements Comparable<Student> {
    /**
     * Имя студента
     */
    private String name;
    /**
     * Количество баллов
     */
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", score=" + score + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return getScore() == student.getScore() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getScore());
    }

    @Override
    public int compareTo(Student student) {
        return student.score - score;
    }
}
