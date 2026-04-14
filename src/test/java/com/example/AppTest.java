package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testGreet() {
        assertEquals("Hello, World!", App.greet("World"));
    }

    @Test
    public void testGreetWithDifferentName() {
        assertEquals("Hello, Maven!", App.greet("Maven"));
    }
}
