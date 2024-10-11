package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void shoudAddNumbers(){
        assertTrue(App.add(5, 2) == 8);
    }

    @Test
    public void shoudMinsNumbers(){
        assertTrue(App.mins(5, 2) == 3);
    }

    
    @Test
    public void shoudTimesNumbers(){
        assertTrue(App.times(5, 2) == 3);
    }

    
}
