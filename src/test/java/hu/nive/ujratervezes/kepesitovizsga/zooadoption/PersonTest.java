package hu.nive.ujratervezes.kepesitovizsga.zooadoption;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void testCreate() {
        Person person = new Person("Kiss József", "kiss.jozsef@gmail.com");

        Assertions.assertEquals("Kiss József", person.getName());
        Assertions.assertEquals("kiss.jozsef@gmail.com", person.getEmail());
    }
}