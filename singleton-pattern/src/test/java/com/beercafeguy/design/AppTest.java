package com.beercafeguy.design;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import com.beercafeguy.design.singleton.Singleton;
import org.junit.Test;

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
    public void testLazySingleton() {
        Singleton s1=Singleton.getSingleInstance();
        Singleton s2=Singleton.getSingleInstance();
        assertEquals(s1,s2);
    }
}
