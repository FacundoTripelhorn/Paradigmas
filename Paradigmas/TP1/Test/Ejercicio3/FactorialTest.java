package Ejercicio3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by GastónAlejandro on 29/08/2016.
 */
public class FactorialTest {
    private Factorial Factorial;
    @Before
    public void setUp() throws Exception {
        Factorial=new Factorial();
    }

    @Test
    public void factorializar() throws Exception {
        Assert.assertEquals(6,Factorial.Factorializar(3));
    }
    @Test
    public void Falsedad() throws Exception{
        Assert.assertFalse(5==Factorial.Factorializar(5));
    }
}