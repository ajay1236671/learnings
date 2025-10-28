package guru.springframework.sfgpetclinic.controllers;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;
import static org.assertj.core.api.Assertions.assertThat;

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

        assertThat(controller.index()).isEqualTo("index");
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

    @EnabledOnOs(OS.MAC)
    @Test
    void testOnMac() {
        System.out.println("This is Mac OS");
        assertEquals("Mac", "Mac", "This is Mac OS");
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testOnWindows() {
        System.out.println("This is Windows OS");
        assertEquals("Windows", "Windows", "This is Windows OS");
    }

    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void testMeOnJava8() {
    }

    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void testMeOnJava11() {
    }

    @EnabledIfEnvironmentVariable(named = "USER", matches = "jt")
    @Test
    void testIfUserJT() {
    }

    @EnabledIfEnvironmentVariable(named = "USER", matches = "fred")
    @Test
    void testIfUserFred() {
    }
}