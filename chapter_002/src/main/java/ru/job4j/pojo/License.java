package ru.job4j.pojo;

import java.util.Date;
import java.util.Objects;

/**
 * Класс - лицензия
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 01.05.2020
 * @version 1.0
 */
public class License {
    private String owner;
    private String model;
    private String code;
    private Date created;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof License)) {
            return false;
        }
        License license = (License) o;
        return  Objects.equals(getCode(), license.getCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }
}
