package com.badri.designpattern;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test FactoryMethod tests
 */
public class AppTest {

    @Test
    public void testFamilyCar() {
        App app = new App();
        assertEquals("FamilyCar", app.factory("family"));

    }

    @Test
    public void testSportsCar() {
        App app = new App();
        assertEquals("SportsCar", app.factory("Sports"));

    }
}
