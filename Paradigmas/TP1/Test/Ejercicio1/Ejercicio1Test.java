package Ejercicio1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by GastónAlejandro on 29/08/2016.
 */
public class Ejercicio1Test {
    private Ejercicio1 Ejercicio1;
    @Before
    public void setUp() {
        this.Ejercicio1 = new Ejercicio1();
    }

    @Test
    public void EsParteRecta() throws Exception {
        Assert.assertEquals(true, Ejercicio1.EsParteRecta(1, 10));
    }

    @Test
    public void NoEsParteRecta() throws Exception {
        Assert.assertFalse(Ejercicio1.EsParteRecta(2, 10));
    }
    }
