package ru.job4j.inheritance;

import org.junit.Assert;
import org.junit.Test;

public class ProgrammerTest {

    @Test
    public void tryCreatingProgrammer() {
        Programmer person = new Programmer();
        person.setName("John");
        person.setSurname("Black");
        person.setBirthday("01.01.1990");
        person.setEducation("Moscow State University");

        Assert.assertEquals(person.getName(), "John");
        Assert.assertEquals(person.getSurname(), "Black");
        Assert.assertEquals(person.getBirthday(), "01.01.1990");
        Assert.assertEquals(person.getEducation(), "Moscow State University");
    }
}
