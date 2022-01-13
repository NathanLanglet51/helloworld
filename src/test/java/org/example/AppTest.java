package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    Calcul d = new Calcul();

    @Test
    public void testAdditionPositive(){
        assertEquals(10, d.add(5,5));
    }

    @Test
    public void testAdditionNegative(){
        assertEquals(-10, d.add(-5,-5));
    }
    }
