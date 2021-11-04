package com.elite.kvijay9;

import com.elite.kvijay9.utils.Utils;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(PowerMockRunner.class)
public class UtilsTest {



    @Test
    public void Test_Constructor_Throws_Exception() throws IllegalAccessException, IllegalStateException, InstantiationException, IllegalArgumentException{
        final Class<?> cls = Utils.class;
        final Constructor<?> c = cls.getDeclaredConstructors()[0];
        c.setAccessible(true);

        Throwable targetException = null;
        try {
            c.newInstance((Object[])null);
        } catch (InvocationTargetException ite) {
            targetException = ite.getTargetException();
        }

        assertNotNull(targetException);
        assertEquals(targetException.getClass(), IllegalStateException.class);
    }

    @Test
    public void testTrim() throws Exception {
        final Class<?> cls = Utils.class;
        final Constructor<?> c = cls.getDeclaredConstructors()[0];
        System.out.println(c.isAccessible());
    }

}
