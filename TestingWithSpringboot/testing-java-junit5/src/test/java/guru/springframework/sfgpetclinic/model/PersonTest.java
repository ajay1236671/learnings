package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAssertions() {

        Person person = new Person(1L, "Joe", "Buck");
        assertAll("Test Props Set", () -> assertEquals("Joe", person.getFirstName()),
                () -> assertEquals("Buck", person.getLastName()));
    }

    @Test
    void groupedAssertionMsgs() {

        Person person = new Person(1L, "Joe", "Buck");

        assertAll("Test Props Set", () -> assertEquals("Joe", person.getFirstName(),
                "First Name Failed"), () -> assertEquals("Buck", person.getLastName(),
                "Last Name Failed"));
    }
}