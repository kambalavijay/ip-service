package com.elite.kvijay9;



import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class Behaviour1Test {

    @Mock
    private Behaviour2 behaviour2;

    @Test
    public void testBehaviour1(){
        Mockito.when(behaviour2.m2("sum")).thenReturn(30);
        Behaviour1 behaviour1 = new Behaviour1(behaviour2);
        int c = behaviour1.m1(10, 20);
        Assert.assertTrue( "both are not same", 30 == c);
    }
}
