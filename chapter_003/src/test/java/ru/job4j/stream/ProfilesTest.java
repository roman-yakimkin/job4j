package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {

    @Test
    public void addressTest() {

        Address address1 = new Address("Moscow", "Lenina", 25,10);
        Address address2 = new Address("Rostov-na-Donu", "Bolshaya Sadovaya", 14,3);
        Address address3 = new Address("Taganrog", "Chekhova", 10,20);
        Address address4 = new Address("Taganrog", "Chekhova", 10,20);
        Address address5 = new Address("Rostov-na-Donu", "Bolshaya Sadovaya", 14,3);
        Address address6 = new Address("Azov", "Beregovaya", 20,2);
        List<Profile> people = Arrays.asList(
                new Profile(address1),
                new Profile(address2),
                new Profile(address3),
                new Profile(address4),
                new Profile(address5),
                new Profile(address6)
        );
        Profiles profiles = new Profiles();
        List<Address> result = profiles.collect(people);
        
        List<Address> expected = Arrays.asList(
                new Address(address6),
                new Address(address1),
                new Address(address2),
                new Address(address3)
        );
        assertThat(result, is(expected));
    }
}
