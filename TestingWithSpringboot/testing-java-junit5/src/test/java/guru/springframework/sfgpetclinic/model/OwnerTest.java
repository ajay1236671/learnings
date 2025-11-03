package guru.springframework.sfgpetclinic.model;

import static org.junit.jupiter.api.Assertions.*;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class OwnerTest implements ModelTests {

    @Test
    void dependentAssertions() {

        Owner owner = new Owner(1l, "Joe", "Buck");
        owner.setCity("Key West");
        owner.setTelephone("1231231234");

        assertAll("Properties Test", () -> assertAll("Person Properties", () -> assertEquals("Joe", owner.getFirstName(), "First Name Did not Match"), () -> assertEquals("Buck", owner.getLastName())), () -> assertAll("Owner Properties", () -> assertEquals("Key West", owner.getCity(), "City Did Not Match"), () -> assertEquals("1231231234", owner.getTelephone())));

        assertThat(owner.getCity(), is("Key West"));
    }

    @DisplayName("Value source")
    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @ValueSource(strings = {"Spring", "Java"})
    void testValueSource(String val) {
        System.out.println(val);
    }

    @DisplayName("Enum source Test")
    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @EnumSource(OwnerType.class)
    void enumTest(OwnerType val) {
        System.out.println(val);
    }

    @DisplayName("CSV input Test")
    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @CsvSource({
            "A,1,1",
            "B,2,21",
            "C,3,2"
    })
    void csvTest(String stateName, int val1, int val2) {
        System.out.println(stateName + "," + val1 + "," + val2);
    }


}