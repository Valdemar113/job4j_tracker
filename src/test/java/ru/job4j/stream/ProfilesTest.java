package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ProfilesTest {
    @Test
            public void whenX() {
    Profiles profiles = new Profiles();
    List<Profile> list = List.of(
            new Profile(new Address("Moscow", "Mira", 1, 33)),
            new Profile(new Address("Petersburg", "Svoboda", 13, 81)),
            new Profile(new Address("Samara", "Nekrasova", 228, 322))

    );
    List<Address> expected = List.of(
            new Address("Moscow", "Mira", 1, 33),
            new Address("Petersburg", "Svoboda", 13, 81),
            new Address("Samara", "Nekrasova", 228, 322)

    );
    List<Address> rsl = profiles.collect(list);
        Assert.assertEquals(rsl, expected);
    }
}