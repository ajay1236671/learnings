package guru.springframework.sfgpetclinic.controllers;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @DisplayName("Test Index")
    @Test
    void index() {
        assertEquals("index", controller.index());
        assertEquals("index", controller.index(), "Wrong View Returned");

        assertEquals("index", controller.index(), () -> "Another Expensive Message " +
                "Make me only if you have to");
    }

    @Test
    @DisplayName("Test Exception")
    @Disabled
    void oupsHandler() {
        assertThrows(ValueNotFoundExecption.class, () -> controller.oupsHandler());
    }


    @Disabled("demo")
    @Test
    void testTimeout() {
        assertTimeout(Duration.ofMillis(1000), () -> {
            Thread.sleep(2000);
            System.out.println("I sleep");
        });
    }

    @Test
    void testAssumptionTrue() {
        assumeTrue("ajay".equalsIgnoreCase("Aja"));
    }

    @Test
    void testAssumptionFalse() {
        assumeTrue("ajay".equalsIgnoreCase("Ajay"));
    }
}