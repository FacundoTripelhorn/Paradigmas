package Ejercicio4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by GastónAlejandro on 29/08/2016.
 */
public class Ejercicio4Test {
    private Ejercicio4 Ejercicio;
    @Before
    public void setUp() throws Exception {
Ejercicio=new Ejercicio4();
    }

    @Test
    public void mostrarResultado() throws Exception {
        Assert.assertEquals(9,Ejercicio.MostrarResultado(2,3));
    }
    @Test
    public void mostrarFalso() throws Exception{
        Assert.assertFalse(9==Ejercicio.MostrarResultado(-2,-3));
    }

}