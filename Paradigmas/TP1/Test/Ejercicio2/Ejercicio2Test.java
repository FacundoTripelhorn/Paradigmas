package Ejercicio2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by GastónAlejandro on 29/08/2016.
 */
public class Ejercicio2Test {
    private Ejercicio2 Ejercicio2;
    @Before
    public void setUp() {
        this.Ejercicio2 = new Ejercicio2();
    }

    @Test
    public void digitomasAlto() throws Exception {
          Assert.assertTrue(4==Ejercicio2.DigitomasAlto(1234));
            }

    /** @Test
    * public void DigitomasAlto() throws Exception{
     *     Assert.assertEquals(4,Ejercicio2.DigitomasAlto(1234))
     * }
     */
    @Test
    public void nofunca() throws Exception{
        Assert.assertFalse(5==Ejercicio2.DigitomasAlto(5642));
            }
}