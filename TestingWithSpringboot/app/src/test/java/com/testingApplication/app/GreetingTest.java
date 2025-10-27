package com.testingApplication.app;

import com.testingApplication.app.Junit5.Greeting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @Test
    void helloWorld() {
        Greeting g = new Greeting();
        assertEquals("Hello World", g.helloWorld("World"));
    }

    @Test
    void testHelloWorld() {
    }
}