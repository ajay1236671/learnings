package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest implements ModelTests {

    @Test
    void groupedAssertions() {

        Person person = new Person(1L, "Joe", "Buck");
        assertAll("Test Props Set", () -> assertEquals("Joe", person.getFirstName()), () -> assertEquals("Buck", person.getLastName()));
    }

    @Test
    void groupedAssertionMsgs() {

        Person person = new Person(1L, "Joe", "Buck");

        assertAll("Test Props Set", () -> assertEquals("Joe", person.getFirstName(), "First Name Failed"), () -> assertEquals("Buck", person.getLastName(), "Last Name Failed"));
    }

//    @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition} - {totalRepetitions}")
//    @DisplayName("My Repeated Test")
//    void myRepeatedTest() {
//        System.out.println("My Repeated Test");
//    }
//
//    @RepeatedTest(5)
//    void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
//
//        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());
//    }
}